package org.example.FactoryMethod;

import org.example.FactoryMethod.Conexion;

public class ConexionOracle implements Conexion {
    @Override
    public void conectar() {
        System.out.println("conectado a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("descaonectado de Oracle");
    }
}
