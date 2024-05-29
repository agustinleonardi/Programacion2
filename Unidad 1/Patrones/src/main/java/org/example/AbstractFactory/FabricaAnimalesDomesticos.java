package org.example.AbstractFactory;

import org.example.AbstractFactory.Entity.Gato;
import org.example.AbstractFactory.Entity.Perro;
import org.example.AbstractFactory.Interface.Animal;
import org.example.AbstractFactory.Interface.FabricaAnimales;

public class FabricaAnimalesDomesticos implements FabricaAnimales {
    @Override
    public Animal crearPerro() {
        return new Perro();
    }

    @Override
    public Animal crearGato() {
        return new Gato();
    }
}
