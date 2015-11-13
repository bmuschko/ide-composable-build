package org.gradle.app.webservice;

import org.gradle.common.b.Converter;

public class Service {
    public void doSomething() {
        System.out.println(Converter.toDollars(new Double(500)));
    }
}