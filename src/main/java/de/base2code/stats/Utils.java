package de.base2code.stats;

import org.bukkit.event.Event;
import org.bukkit.event.block.BlockBreakEvent;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public class Utils {
    public static void eventFire(Event event) {
        // Get all data from event via reflection
        CompletableFuture.runAsync(() -> {
            HashMap<String, String> data = getData(event);
            data.put("event", event.getClass().getSimpleName());
            Stats.getInstance().getFileManager().setStat(event.getEventName(), new JSONObject(data).toString().length());
        });
    }

    public static HashMap<String, String> getData(Object object) {
        HashMap<String, String> data = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object objdata = field.get(object);
                if (objdata != null && !objdata.toString().contains("@"))
                    data.put(field.getName(), objdata.toString());
            } catch (IllegalAccessException | InaccessibleObjectException e) {
                continue;
            }
        }
        return data;
    }
}
