package com.java.behavioral.abstractfactory;

import com.java.behavioral.abstractfactory.animal.Duck;
import com.java.behavioral.abstractfactory.color.White;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");
        Duck duck = (Duck) animalFactory.create("Duck");
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound());

        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");
        White white = (White) colorFactory.create("White");
        System.out.println(white.getColor());

    }
}
