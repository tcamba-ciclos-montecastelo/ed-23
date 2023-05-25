package com.ciclosmontecastelo.telefono;

import java.util.List;

public interface PantallaObserver {
    void actualizar(List<Integer> digitos);
}
