package com.java.behavioral.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
