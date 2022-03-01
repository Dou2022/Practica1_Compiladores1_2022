package com.example.practica1.domain ;

public class Grafico {
    private String titulo;
    private Barra barra;
    private Pie pie;

    public Grafico(String titulo, Barra barra) {
        this.titulo = titulo;
        this.barra = barra;
    }

    public Grafico(String titulo, Pie pie) {
        this.titulo = titulo;
        this.pie = pie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Barra getBarra() {
        return barra;
    }

    public void setBarra(Barra barra) {
        this.barra = barra;
    }

    public Pie getPie() {
        return pie;
    }

    public void setPie(Pie pie) {
        this.pie = pie;
    }

    @Override
    public String toString() {
        return "Grafico{" +
                "titulo='" + titulo + '\'' +
                ", barra=" + barra +
                ", pie=" + pie +
                '}';
    }
}
