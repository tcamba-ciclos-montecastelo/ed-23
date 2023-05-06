package com.ciclosmontecastelo.decorator;

public class LucesDecorator extends BaseDecorator {

    public LucesDecorator(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }

    @Override
    public String decorar() {
        return super.decorar() + " con luces";
    }
}
