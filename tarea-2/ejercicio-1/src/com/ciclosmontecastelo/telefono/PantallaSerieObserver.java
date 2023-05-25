package com.ciclosmontecastelo.telefono;

import java.util.List;

public class PantallaSerieObserver implements PantallaObserver {
    @Override
    public void actualizar(List<Integer> digitos) {
        System.out.print("Marcando: ");
        digitos.forEach(System.out::print);
    }
}
