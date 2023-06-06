package org.example;

import java.util.ArrayList;

public class Cancion extends Contenido {
    //Atributos
    private boolean album;


    //Constructor
    public Cancion(String titulo, Artista artista, double duracion) {
        super(titulo, artista, duracion);
        this.album = false;
    }

    //Getters and Setters
    public boolean isAlbum() {
        return album;
    }
    public void setAlbum(boolean album) {
        this.album = album;
    }


    //Metodos
    public boolean comprobar(Cancion cancion){

        return false;
    }
}

