package org.example;

import java.util.ArrayList;

public class Album extends Contenido{
    //Atributos
    private int numeroCanciones;


    //Constructor
    public Album(String titulo, Artista artista, double contenido, int numeroCanciones) {
        super(titulo, artista, contenido);
        this.numeroCanciones = numeroCanciones;
    }

    //Getters and Setters

    public int getNumeroCanciones() {
        return numeroCanciones;
    }
    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }



}

