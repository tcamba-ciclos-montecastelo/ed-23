package com.ciclosmontecastelo.telefono;

public class Main {
    public static void main(String[] args) {

        // Creamos un teclado y le asignamos un telefono
        Telefono telefono = new Telefono();
        Teclado teclado = new Teclado(telefono);

        // Creamos una pantalla de tipo serie que mostrará el número nada más se marque
        // la añadimos a la lista de pantallas
        PantallaParalelaObserver pantallaParalelaObserver = new PantallaParalelaObserver();
        telefono.addObservador(pantallaParalelaObserver);

        // Simulamos un marcado
        teclado.simularMarcado(9);

        // Si no eliminamos el observador serie anterior, será notificado de nuevo cuando utilicemos el método notificar
        // para imprimir el número íntegro
        // Se trata de un caso en el que el método de la interfaz de los observadores se utiliza tanto el cliente del
        // publicador (el Main) como en el propio publicador, como efecto colateral del método addDigito
        telefono.removeObservador(pantallaParalelaObserver);
        PantallaSerieObserver pantallaSerieObserver = new PantallaSerieObserver();
        telefono.addObservador(pantallaSerieObserver);

        System.out.println();
        telefono.notificarPantallas();
    }
}
