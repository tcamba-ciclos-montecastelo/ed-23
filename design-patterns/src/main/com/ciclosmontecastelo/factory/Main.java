package com.ciclosmontecastelo.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Inicializo una lista con las factorias concretas de Coche y Moto
        List<VehiculoMotorFactory> factorias = Arrays.asList(new MotoFactory(), new CocheFactory());

        // Inicializo una lista que contendrá un vehículo de cada tipo
        List<VehiculoMotor> vehiculos = new ArrayList<>();

        // Recorro la lista de factorias invocando a su método create(), definido en la clase abstracta VehiculoFactory
        //
        // for (VehiculoMotorFactory factoria: factorias) {
        //     vehiculos.add(factoria.create());
        // }
        //
        // El for-each de arriba también se puede expresar usando la API funcional de JAVA (versiones >= Java 8)
        factorias.stream().forEach(factoria -> vehiculos.add(factoria.create()));

        // Finalmente recorro la lista de vehículos llamando al método acelerar de la interfaz VehículoMotor
        //
        // for (VehiculoMotor vehiculo: vehiculos) {
        //     System.out.println(vehiculo.acelerar());
        // }
        // Igual que en las líneas anteriores, pero en esta ocasión, lo ejecutamos en "paralelo"
        vehiculos.parallelStream().forEach(vehiculo -> System.out.println(vehiculo.acelerar()));
    }
}