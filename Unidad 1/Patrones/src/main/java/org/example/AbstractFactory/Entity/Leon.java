package org.example.AbstractFactory.Entity;

import org.example.AbstractFactory.Interface.Animal;

public class Leon implements Animal {
    @Override
    public void hablar() {
        System.out.println("Roar!");
    }
}
