package com.clases;

public class Producto {
    private String nombreProducto;
    private String carateristicas;
    private String idProducto;
    private String condiciones;

    public Producto( String nombre, String carateristicas, String  idProducto, String condiciones){
        this.nombreProducto = nombre;
        this.carateristicas=carateristicas;
        this.idProducto=idProducto;
        this.condiciones=condiciones;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCarateristicas() {
        return carateristicas;
    }

    public void setCarateristicas(String carateristicas) {
        this.carateristicas = carateristicas;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
}
