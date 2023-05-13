package com.ciclosmontecastelo.observer;

public class Noticia {
    private String titular;
    private String resumen;

    public String getTitular() {
        return titular;
    }

    public String getResumen() {
        return resumen;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getNoticia() {
        return String.format("----------\nTitular:\n %s\nResumen:\n %s\n", getTitular(), getResumen());
    }
}
