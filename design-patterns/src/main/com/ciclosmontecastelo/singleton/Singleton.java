package com.ciclosmontecastelo.singleton;

public final class Singleton {
    private static Singleton instancia;

    // Este atributo solo sirve para demostrar que no se crean objetos nuevos. Ver la clase Main.
    private String valor;

    // Este constructor es privado y por tanto no puede ser utilizado por ninguna otra clase
    private Singleton(String valor) {
        this.valor = valor;
    }

    // Este método es el constructor que emplearán las clases cliente que quieran un objeto de la clase Singleton
    public static Singleton getInstancia(String valor) {
        // Si EXISTE un objeto singleton sigo adelante, pero
        // Si NO EXISTE entonces lo creo
        if (instancia == null) {
            instancia = new Singleton(valor);
        }

        return instancia;
    }

    public String getValor() {
        return valor;
    }
}
