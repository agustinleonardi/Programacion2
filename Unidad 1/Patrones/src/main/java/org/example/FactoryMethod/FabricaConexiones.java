package org.example.FactoryMethod;

public class FabricaConexiones {
    public static Conexion obtenerConexion(String tipo){
        if (tipo == null){
            return null;
        }
        if (tipo.equalsIgnoreCase("MySQL")){
            return new ConexionMySQL();
        }else if (tipo.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }
        return null;
    }
}
