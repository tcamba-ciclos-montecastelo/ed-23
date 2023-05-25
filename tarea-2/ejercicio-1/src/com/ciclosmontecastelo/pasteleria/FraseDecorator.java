package com.ciclosmontecastelo.pasteleria;

public class FraseDecorator extends PastelBaseDecorator {

    private final String frase;

    public FraseDecorator(Pastel pastel, String frase) {
        super(pastel);
        this.frase = frase;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + String.format(" con la frase \"%s\"", frase);
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }
}
