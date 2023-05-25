package com.ciclosmontecastelo.telefono;

import java.util.ArrayList;
import java.util.List;

/**
 * Almacena un número de teléfono, dígito a dígito
 */
public class Telefono {
    private List<Integer> digitos = new ArrayList<>();
    private List<PantallaObserver> pantallas = new ArrayList<>();

    public void addObservador(PantallaObserver pantallaObserver) {
        pantallas.add(pantallaObserver);
    }

    public void removeObservador(PantallaObserver pantallaObserver) {
        pantallas.remove(pantallaObserver);
    }

    public void notificarPantallas() {
        for (PantallaObserver pantalla : pantallas) {
            pantalla.actualizar(digitos);
        }
    }

    public void addDigito(int nuevoDigito) {
        digitos.add(nuevoDigito);
        notificarPantallas();
    }

    public List<Integer> getDigitos() {
        return digitos;
    }
}
