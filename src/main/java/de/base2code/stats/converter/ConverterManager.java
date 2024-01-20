package de.base2code.stats.converter;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Set;

public class ConverterManager {
    private HashMap<Class<?>, ConverterBase> convertes = new HashMap<>();

    public void fillList() {
        // Search for classes with ConverterAnnotation
        // and add them to the list
        Reflections reflections = new Reflections("de.base2code.stats.converter.converters");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(ConverterAnnotation.class);

        for (Class<?> controller : annotated) {
            ConverterBase converter = null;
            try {
                converter = (ConverterBase) controller.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            if (converter != null) {
                convertes.put(converter.getConvertedClass(), converter);
                System.out.println("Added converter for " + converter.getConvertedClass().getSimpleName());
            }
        }
    }

    public boolean hasConverter(Class<?> clazz) {
        return convertes.containsKey(clazz);
    }

    public String convert(Object obj) {
        return convertes.get(obj.getClass()).convert(obj);
    }
}
