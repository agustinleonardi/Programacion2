package org.example.Adapter;

public class ConexionEthernet implements EnviarMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por Ethernet: " + mensaje);
    }
}
