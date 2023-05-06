package com.ciclosmontecastelo.decorator;

public class EstrellaDecorator extends BaseDecorator {
    public EstrellaDecorator(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }

    @Override
    public String decorar() {
        return super.decorar() + " con estrella";
    }
}
