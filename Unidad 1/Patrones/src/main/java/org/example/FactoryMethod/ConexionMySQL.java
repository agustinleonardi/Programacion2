package org.example.FactoryMethod;

import org.example.FactoryMethod.Conexion;

public class ConexionMySQL implements Conexion {
    @Override
    public void conectar(){
        System.out.println("conectado a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("desconectado de MySQL");
    }
}
