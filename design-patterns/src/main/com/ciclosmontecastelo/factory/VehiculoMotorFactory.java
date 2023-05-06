package com.ciclosmontecastelo.factory;

public abstract class VehiculoMotorFactory {

    // Método utilizado para crear objetos del tipo concreto con la factoría concreta
    public VehiculoMotor create() {
        VehiculoMotor vehiculoMotor = createVehiculo();
        return vehiculoMotor;
    }

    // Método que implementarán las factorias concretas
    protected abstract VehiculoMotor createVehiculo();
}
