package com.ciclosmontecastelo.observer;

import java.util.List;

public class CanalRss implements Canal {
    @Override
    public void actualizar(List<Noticia> noticias) {
        System.out.println("** CanalRSS **");
        noticias.forEach(noticia -> System.out.println(noticia.getNoticia()));
    }
}
