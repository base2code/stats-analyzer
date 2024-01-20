package de.base2code.stats.converter.converters;

import de.base2code.stats.converter.ConverterAnnotation;
import de.base2code.stats.converter.ConverterBase;
import org.bukkit.Location;

@ConverterAnnotation
public class LocationConverter implements ConverterBase {
    @Override
    public Class<?> getConvertedClass() {
        return Location.class;
    }

    @Override
    public String convert(Object obj) {
        Location loc = (Location) obj;
        return loc.getWorld().getName() + "," + loc.getBlockX() + "," + loc.getBlockY() + "," + loc.getBlockZ();
    }
}
