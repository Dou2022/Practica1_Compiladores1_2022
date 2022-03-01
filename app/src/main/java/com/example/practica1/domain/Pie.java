package com.example.practica1.domain ;

public class Pie {
    
    private String titulo;
    private String tipo;
    private String[] etiquetas;
    private Double[] valores;
    private Double total;
    private Double[][] unir;
    private String extra;

    public Pie(String titulo, String tipo, String[] etiquetas, Double[] valores, Double total, Double[][] unir, String extra) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.etiquetas = etiquetas;
        this.valores = valores;
        this.total = total;
        this.unir = unir;
        this.extra = extra;
    }

    public Pie(String titulo, String tipo, String[] etiquetas, Double[] valores, Double[][] unir, String extra) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.etiquetas = etiquetas;
        this.valores = valores;
        this.unir = unir;
        this.extra = extra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String[] etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Double[] getValores() {
        return valores;
    }

    public void setValores(Double[] valores) {
        this.valores = valores;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double[][] getUnir() {
        return unir;
    }

    public void setUnir(Double[][] unir) {
        this.unir = unir;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
