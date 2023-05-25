package com.ciclosmontecastelo.pasteleria;

public class FideosAzucarDecorator extends PastelBaseDecorator {

    public FideosAzucarDecorator(Pastel pastel) {
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con fideos de azúcar";
    }

    @Override
    public int getPrecio() {
        return super.getPrecio() + 2;
    }
}
