package com.ciclosmontecastelo.factory;

public class MotoFactory extends VehiculoMotorFactory {
    @Override
    protected VehiculoMotor createVehiculo() {
        return new Moto();
    }
}