package org.example;

public class Contenido {

    private int idActual = 1;
    private  int id;
    private String titulo;
    private Artista artista;
    private double duracion;

    //Constructor
    public Contenido(String titulo, Artista artista, double duracion) {
        this.id = idActual++;
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    //Get y Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public double getContenido() {
        return duracion;
    }

    public void setContenido(double contenido) {
        this.duracion = contenido;
    }

    //Metodos

    /*
    public boolean darLike (Contenido contenido){

    }


    */




}
