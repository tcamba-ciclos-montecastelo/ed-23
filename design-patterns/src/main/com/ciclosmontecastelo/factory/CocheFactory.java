package com.ciclosmontecastelo.factory;

public class CocheFactory extends VehiculoMotorFactory {
    @Override
    protected VehiculoMotor createVehiculo() {
        return new Coche();
    }
}
