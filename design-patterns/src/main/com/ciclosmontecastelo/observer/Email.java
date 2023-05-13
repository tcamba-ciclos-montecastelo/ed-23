package com.ciclosmontecastelo.observer;

import java.util.List;

public class Email implements Canal {
    @Override
    public void actualizar(List<Noticia> noticias) {
        System.out.println("** Email **");
        noticias.forEach(noticia -> System.out.println(noticia.getNoticia()));
    }
}

