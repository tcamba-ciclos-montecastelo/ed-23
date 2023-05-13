package com.ciclosmontecastelo.observer;

public class Main {
    public static void main(String[] args) {
        // Instanciamos el publicador
        PublicadorNoticias publicadorNoticias = new PublicadorNoticias();

        // Enviamos un par de noticias al publicador
        Noticia noticia = new Noticia();
        noticia.setTitular("Noticia 1");
        noticia.setResumen("Resumen Noticia 1");

        publicadorNoticias.addNoticia(noticia);

        // Añadimos los 3 canales a la lista de observadores del publicador
        publicadorNoticias.addCanal(new Email());
        publicadorNoticias.addCanal(new NotificacionPush());
        publicadorNoticias.addCanal(new CanalRss());

        // Notificamos a los canales las 2 noticias que hemos enviado al publicador
        publicadorNoticias.notificarCanales();
    }
}