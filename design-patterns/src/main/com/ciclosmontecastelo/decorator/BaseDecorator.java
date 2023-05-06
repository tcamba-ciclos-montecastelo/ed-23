package com.ciclosmontecastelo.decorator;

public abstract class BaseDecorator implements ArbolNavidad {
    private ArbolNavidad arbolNavidad;

    public BaseDecorator(ArbolNavidad arbolNavidad) {
        this.arbolNavidad = arbolNavidad;
    }

    @Override
    public String decorar() {
        return arbolNavidad.decorar();
    }
}
