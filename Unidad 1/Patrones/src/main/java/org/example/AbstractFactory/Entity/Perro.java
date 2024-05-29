package org.example.AbstractFactory.Entity;

import org.example.AbstractFactory.Interface.Animal;

public class Perro implements Animal {
    @Override
    public void hablar() {
        System.out.println("guau guau");
    }
}
