package com.ciclosmontecastelo.factory;

public interface VehiculoMotor {

    // Getters y Setters de los atributos comunes a todos los vehículos
    // Habitualmente se declara una clase o una clase abstracta de la que cada tipo de vehículo hereda...
    // ... pero en este caso optamos por "programar orientado a interfaces" para reducir el acople aunque implique
    // duplicar código en las clases concretas
    int getNumeroRuedas();

    int getCapacidadDeposito();

    int getPotencia();

    String getTipoCombustible();

    void setNumeroRuedas(int numeroRuedas);

    void setCapacidadDeposito(int capacidadDeposito);

    void setPotencia(int potencia);

    void setTipoCombustible(String tipoCombustible);

    // Métodos comunes a todos los vehículos de motor
    String arrancar();

    String acelerar();

    String frenar();
}
