package com.ciclosmontecastelo.pasteleria;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final List<Pastel> pasteles = new ArrayList<>();

    public void addPastel(Pastel pastel) {
        pasteles.add(pastel);
    }

    public void printPedido() {
        for (Pastel pastel : pasteles) {
            System.out.printf("   %2d  %s\n", pastel.getPrecio(), pastel.getDescripcion());
        }
    }
}
