package org.gradle.common.b;

public class Converter {
    public static Double toDollars(Double euros) {
        return euros * 1.08;
    }
}