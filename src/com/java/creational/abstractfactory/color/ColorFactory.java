package com.java.creational.abstractfactory.color;

import com.java.creational.abstractfactory.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(final String type) {
        Color color = null;
        if ("White".equalsIgnoreCase(type)) {
            color = new White();
        } else if ("Red".equalsIgnoreCase(type)) {
            color = new Red();
        }
        return color;
    }
}
