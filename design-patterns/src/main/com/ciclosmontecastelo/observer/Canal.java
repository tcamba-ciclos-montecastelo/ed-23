package com.ciclosmontecastelo.observer;

import java.util.List;

/*
    La interfaz común a todos los observadores
    Solo contiene un método que permite al publicador notificar a sus observadores que ha ocurrido un evento
 */
public interface Canal {
    void actualizar(List<Noticia> noticias);
}
