package com.ciclosmontecastelo.observer;

import java.util.ArrayList;
import java.util.List;

public class PublicadorNoticias {

    // Lista de observadores "Canales"
    private List<Canal> canales;
    // Lista de noticias
    private List<Noticia> noticias;

    // Inicializamos noticias y canales
    public PublicadorNoticias() {
        noticias = new ArrayList<>();
        canales = new ArrayList<>();
    }

    public void addNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void addCanal(Canal canal) {
        canales.add(canal);
    }

    public void removeCanal(Canal canal) {
        canales.remove(canal);
    }

    public void notificarCanales() {
        canales.forEach(canal -> canal.actualizar(noticias));

        // Tras enviar las noticias a todos los canales, limpiamos el buffer de noticias
        noticias.clear();
    }
}

