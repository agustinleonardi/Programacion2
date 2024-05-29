package org.example.Singleton;

import java.util.HashMap;
import java.util.Map;

public final class Configuracion {
    private static Configuracion instance;
    private String url;
    private int maxConexiones;

    private Configuracion(){
        this.url="\"http://api.ejemplo.com\"";
        this.maxConexiones=10;
    }

    public static Configuracion getInstance() {
        if (instance == null) { // Primera comprobación
            instance = new Configuracion();
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMaxConexiones() {
        return maxConexiones;
    }

    public void setMaxConexiones(int maxConexiones) {
        this.maxConexiones = maxConexiones;
    }
}
