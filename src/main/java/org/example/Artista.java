package org.example;

public class Artista extends User{

    private boolean artistaVerificado;

    //Constructor
    public Artista(String nombre, String mail, String contraseña, boolean artistaVerificado) {
        super(nombre, mail, contraseña);
        this.artistaVerificado = artistaVerificado;
    }

    public void publicar(Contenido contenido){


    }



}
