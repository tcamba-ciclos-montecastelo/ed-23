package com.ciclosmontecastelo.pasteleria;

public class MulticapaDecorator extends PastelBaseDecorator {

    public MulticapaDecorator(Pastel pastel) {
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " multicapa";
    }

    @Override
    public int getPrecio() {
        return super.getPrecio() + 5;
    }
}
