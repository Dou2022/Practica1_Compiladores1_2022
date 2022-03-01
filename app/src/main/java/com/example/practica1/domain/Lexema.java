package com.example.practica1.domain ;

public class Lexema {
    
    private int line;
    private int column;
    private String text;
    public Lexema(int line, int column, String text) {
        this.line = line;
        this.column = column;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public Lexema(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    
}
