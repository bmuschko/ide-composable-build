package org.gradle.common.c;

import org.gradle.common.a.StringUtils;
import org.gradle.common.b.Converter;

public class Usage {
    public static void test() {
        System.out.println(StringUtils.capitalize("hello"));
        System.out.println(Converter.toDollars(new Double(500)));
    }
}