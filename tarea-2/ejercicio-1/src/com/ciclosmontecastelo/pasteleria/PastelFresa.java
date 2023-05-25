package com.ciclosmontecastelo.pasteleria;

public class PastelFresa extends Pastel {

    @Override
    public String getDescripcion() {
        return "Pastel de fresa";
    }

    @Override
    public int getPrecio() {
        return super.getPrecio() * 2;
    }
}
