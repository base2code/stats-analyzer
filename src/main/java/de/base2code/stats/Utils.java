package de.base2code.stats;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.json.JSONObject;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Utils {
    public static void eventFire(Event event, Object... data) {
        StringBuilder jsonData = new StringBuilder("v1;" + event.getEventName() + ";");

        Map<String, Object> dataMap = getData(event);
        for (String key : dataMap.keySet()) {
            jsonData.append(key).append(":");
            Object obj = dataMap.get(key);
            if (Stats.getInstance().getConverterManager().hasConverter(obj.getClass())) {
                jsonData.append(Stats.getInstance().getConverterManager().convert(obj));
            } else {
                Map<String, Object> objData = getData(obj);
                for (String objKey : objData.keySet()) {
                    jsonData.append(objKey).append(":");
                    Object objObj = objData.get(objKey);
                    if (Stats.getInstance().getConverterManager().hasConverter(objObj.getClass())) {
                        jsonData.append(Stats.getInstance().getConverterManager().convert(objObj));
                    } else {
                        jsonData.append(objObj.toString());
                    }
                    jsonData.append(";");
                }
            }
        }

        System.out.println(jsonData.toString());

    }

    /*public static void eventFire(Event event, Object... data) {
        StringBuilder jsonData = new StringBuilder("v1;" + event.getEventName() + ";");
        for (Object s : data) {
            if (s instanceof Player) {
                jsonData.append(Converter.strFromPlayer((Player) s));
            } else if (s instanceof ItemStack) {
                jsonData.append(Converter.strFromItemStack((ItemStack) s));
            } else if (s instanceof String) {
                jsonData.append(s);
            } else if (s instanceof Location) {
                jsonData.append(Converter.strFromLocation((Location) s));
            } else if (s instanceof Block) {
                jsonData.append(Converter.strFromBlock((Block) s));
            } else {
                System.out.println("Unknown type: " + s.getClass().getSimpleName() + " : " + s.toString());
            }
            jsonData.append(";");
        }
        System.out.println(jsonData.toString());
    }*/

    /*public static void eventFire(Event event) {
        // Get all data from event via reflection
        CompletableFuture.runAsync(() -> {
            HashMap<String, String> data = getData(event);
            data.put("event", event.getClass().getSimpleName());

            String jsonData = new JSONObject(data).toString();
            //System.out.println(jsonData);
            //Stats.getInstance().getFileManager().setStat(event.getEventName(), new JSONObject(data).toString().length());
        });
    }*/

    public static Map<String, Object> getData(Object object) {
        HashMap<String, Object> data = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object objdata = field.get(object);
                data.put(field.getName(), objdata.toString());
            } catch (IllegalAccessException | InaccessibleObjectException e) {
                continue;
            }
        }
        return data;
    }
}
