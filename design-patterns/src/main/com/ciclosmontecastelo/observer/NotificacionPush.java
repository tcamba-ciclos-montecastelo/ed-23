package com.ciclosmontecastelo.observer;

import java.util.List;

public class NotificacionPush implements Canal {
    @Override
    public void actualizar(List<Noticia> noticias) {
        System.out.println("** NotificacionPush **");
        noticias.forEach(noticia -> System.out.println(noticia.getNoticia()));
    }
}

