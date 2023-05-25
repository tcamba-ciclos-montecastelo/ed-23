package com.ciclosmontecastelo.pasteleria;

public abstract class PastelBaseDecorator extends Pastel {

    private final Pastel pastel;

    public PastelBaseDecorator(Pastel pastel) {
        this.pastel = pastel;
    }

    @Override
    public String getDescripcion() {
        return pastel.getDescripcion();
    }

    @Override
    public int getPrecio() {
        return pastel.getPrecio();
    }
}
