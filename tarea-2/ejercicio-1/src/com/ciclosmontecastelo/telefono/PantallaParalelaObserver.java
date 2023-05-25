package com.ciclosmontecastelo.telefono;

import java.util.List;

public class PantallaParalelaObserver implements PantallaObserver {
    @Override
    public void actualizar(List<Integer> digitos) {
        System.out.println(digitos.get(digitos.size() - 1));
    }
}
