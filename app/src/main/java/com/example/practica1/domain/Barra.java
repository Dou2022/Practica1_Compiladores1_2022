
package com.example.practica1.domain ;

import java.util.ArrayList;

public class Barra {
    private String titulo;
    private String[] ejeX;
    private Double[] ejeY;
    private Double[][] unir;

    public Barra() {
        this.titulo = null;
        this.ejeY = null;
        this.ejeX = null;
        this.unir = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getEjeX() {
        return ejeX;
    }

    public void setEjeX(String[] ejeX) {
        this.ejeX = ejeX;
    }

    public Double[] getEjeY() {
        return ejeY;
    }

    public void setEjeY(Double[] ejeY) {
        this.ejeY = ejeY;
    }

    public Double[][] getUnir() {
        return unir;
    }

    public void setUnir(Double[][] unir) {
        this.unir = unir;
    }
}