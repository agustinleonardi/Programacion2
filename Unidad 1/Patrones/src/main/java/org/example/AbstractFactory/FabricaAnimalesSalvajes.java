package org.example.AbstractFactory;

import org.example.AbstractFactory.Entity.Leon;
import org.example.AbstractFactory.Entity.Tigre;
import org.example.AbstractFactory.Interface.Animal;
import org.example.AbstractFactory.Interface.FabricaAnimales;

public class FabricaAnimalesSalvajes implements FabricaAnimales {
    @Override
    public Animal crearGato() {
        return new Tigre();
    }

    @Override
    public Animal crearPerro() {
        return new Leon();
    }
}
