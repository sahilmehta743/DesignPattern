package com.java.behavioral.abstractfactory;

import com.java.behavioral.abstractfactory.animal.AnimalFactory;
import com.java.behavioral.abstractfactory.color.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(final String choice) {
        AbstractFactory abstractFactory = null;
        if ("Animal".equalsIgnoreCase(choice)) {
            abstractFactory = new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            abstractFactory = new ColorFactory();
        }
        return abstractFactory;
    }
}
