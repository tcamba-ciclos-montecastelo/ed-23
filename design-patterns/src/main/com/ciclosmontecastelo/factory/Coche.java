package com.ciclosmontecastelo.factory;

public class Coche implements VehiculoMotor {
    private int numeroRuedas;
    private int potencia;
    private int capacidadDeposito;
    private String tipoCombustible;

    @Override
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    @Override
    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    @Override
    public int getPotencia() {
        return potencia;
    }

    @Override
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    @Override
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    @Override
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String arrancar() {
        return "Coche arrancando";
    }

    @Override
    public String acelerar() {
        return "Coche acelerando";
    }

    @Override
    public String frenar() {
        return "Coche frenando";
    }
}
