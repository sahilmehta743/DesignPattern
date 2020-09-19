package com.java.creational.abstractfactory.animal;

import com.java.creational.abstractfactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(final String type) {
        Animal animal = null;
        if ("Dog".equalsIgnoreCase(type)) {
            animal = new Dog();
        }else if("Duck".equalsIgnoreCase(type)){
            animal = new Duck();
        }
        return animal;
    }
}
