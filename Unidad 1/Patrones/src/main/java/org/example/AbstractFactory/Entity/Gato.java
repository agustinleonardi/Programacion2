package org.example.AbstractFactory.Entity;

import org.example.AbstractFactory.Interface.Animal;

public class Gato implements Animal {
    @Override
    public void hablar() {
        System.out.println("miau miau");
    }
}
