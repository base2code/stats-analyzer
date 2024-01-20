package de.base2code.stats.converter;

public interface ConverterBase {
    Class<?> getConvertedClass();
    String convert(Object obj);
}
