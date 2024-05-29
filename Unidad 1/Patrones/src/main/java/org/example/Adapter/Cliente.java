package org.example.Adapter;

public class Cliente {
   private EnviarMensaje conexion;
   public Cliente (EnviarMensaje conexion) {
       this.conexion = conexion;
   }
   public void enviar(Mensaje mensaje){
       conexion.enviarMensaje(mensaje.getContenido());
   }
}
