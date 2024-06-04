package com.example.integradorunidad1;

public class ProductSelector {
    public Producto selectProduct(String category, String nombre,double price){
        ProductFactory factory;
        switch (category.toLowerCase()){
            case "electronica":
                factory = new ElectronicaFactory();
                break;
            case "ropa":
                factory = new RopaFactory();
                break;
            case "vehiculo":
                factory = new VehiculoFactory();
                break;
            default:
                throw new IllegalArgumentException("ERROR: categoria desconocida: " + category);
        }
        return factory.createProduct(nombre,price);
    }

}
