package org.example;

import org.example.Adapter.Cliente;
import org.example.Adapter.ConexionEthernet;
import org.example.Adapter.EnviarMensaje;
import org.example.Adapter.Mensaje;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


//        //FactoryMethod
//        Conexion conexion = FabricaConexiones.obtenerConexion("MySQL");
//        if(conexion != null){
//            conexion.conectar();
//            conexion.desconectar();
//        }else {
//            System.out.println("no se pudo obtener la conexion MySQL");
//        }
//
//        Conexion conexion2 = FabricaConexiones.obtenerConexion("ORACLE");
//        if(conexion2 != null){
//            conexion2.conectar();
//            conexion2.desconectar();
//        }else {
//            System.out.println("no se pudo obtener la conexion ORACLE");
//        }

        //SINGLETON
//        Configuracion config = Configuracion.getInstance();
//
//        System.out.println(config.getUrl());
//        System.out.println(config.getMaxConexiones());

        //ABSTRACT FACTORY
//        FabricaAnimales fabricaDomesticos = new FabricaAnimalesDomesticos();
//        Animal gato = fabricaDomesticos.crearGato();
//        Animal perro = fabricaDomesticos.crearPerro();
//
//        gato.hablar();
//        perro.hablar();
//
//        FabricaAnimales fabricaSalvajes = new FabricaAnimalesSalvajes();
//        Animal leon = fabricaSalvajes.crearPerro();
//        Animal tigre = fabricaSalvajes.crearGato();
//
//        leon.hablar();
//        tigre.hablar();


        //BUILDER
//        Auto auto = new Auto.Builder()
//                .color("rojo")
//                .marca("toyota")
//                .modelo("corolla")
//                .build();
//        System.out.println("Auto creado " + auto.getMarca() + " " + auto.getColor() + " " + auto.getModelo());
//

        //PROTOTYPE
//        Circulo circulo = new Circulo(2,3);
//        Circulo circulo2= circulo.clonar();
//
//        System.out.println("estos son los datos del circulo original = "+circulo.getCentro()+" "+circulo.getRadio()+" y estos los del clonado = "+circulo2.getCentro()+" "+circulo2.getRadio());

        //ADAPTERI
        EnviarMensaje conexion = new ConexionEthernet();
        Cliente cliente = new Cliente(conexion);

        Mensaje mensaje = new Mensaje("hola Agu");
        cliente.enviar(mensaje);
    }
}