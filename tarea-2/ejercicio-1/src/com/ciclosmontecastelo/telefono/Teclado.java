package com.ciclosmontecastelo.telefono;

import java.util.Random;

public class Teclado {
    private final Telefono telefono;

    public Teclado(Telefono telefono) {
        this.telefono = telefono;
    }

    public void simularMarcado(int numeroDigitosPulsados) {
        final int MAX_DIGITO = 10;
        Random rnd = new Random();
        for (int i = 0; i < numeroDigitosPulsados; i++) {
            int nuevoDigito = rnd.nextInt(MAX_DIGITO);
            System.out.println("Pulsando: " + nuevoDigito);
            telefono.addDigito(nuevoDigito);
        }
    }

}
