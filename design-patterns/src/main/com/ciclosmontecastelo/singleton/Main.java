package com.ciclosmontecastelo.singleton;

public class Main {
    public static void main(String[] args) {

        // Creamos una instancia de Singleton con el atributo valor a TACIO
        Singleton instancia1 = Singleton.getInstancia("TACIO");
        // Mostramos el valor de la instancia recién creada, debe mostrar: TACIO
        System.out.println(instancia1.getValor());

        // Ahora creamos una segunda instancia con el atributo valor a DAVID
        Singleton instancia2 = Singleton.getInstancia("DAVID");
        // Mostramos el valor de la instancia creada arriba y como era de esperar recibimos TACIO y no DAVID
        // porque ya existía una instancia con valor TACIO de modo que no se crea una nueva con el valor DAVID
        System.out.println(instancia2.getValor());
    }
}