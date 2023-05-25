package com.ciclosmontecastelo.pasteleria;

public abstract class Pastel {

    private final int PRECIO = 10;

    public int getPrecio() {
        return PRECIO;
    }

    public abstract String getDescripcion();
}
