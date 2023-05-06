package com.ciclosmontecastelo.decorator;

public class Main {
    public static void main(String[] args) {

        // Instancio un árbol de navidad
        ArbolNavidad arbol = new ArbolNavidadImpl();

        // Imprimo la salida del método decorar del árbol básico
        System.out.println(arbol.decorar());

        // Primer decorador: Luces
        // Envuelvo el árbol base con el decorador de Luces e imprimo por pantalla el resultado del método decorar
        // ampliado
        ArbolNavidad arbolConLuces = new LucesDecorator(arbol);
        System.out.println(arbolConLuces.decorar());

        // Segundo decorador: Estrella
        // Envuelvo el árbol decorado con luces con el decorador de la estrella e imprimo por pantalla el resultado del
        // método decorar ampliado
        ArbolNavidad arbolConLucesEstrella = new EstrellaDecorator(arbolConLuces);
        System.out.println(arbolConLucesEstrella.decorar());

        // El árbol original ahora tiene 2 capas (decoradores) que lo "envuelven" y extienden sus funciones
        // sin necesidad de modificar la clase original

    }
}