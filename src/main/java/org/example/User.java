package org.example;

import java.sql.Connection;

public class User {
    //Atributos
    private int idActual = 1;
    private int id;
    private String nombre;
    private String mail;
    private String password;

    /**
     * Constructor con 2 parametros
     *
     * @param nombre
     * @param mail
     */
    public User( String nombre, String mail, String password) {
        this.id = idActual++;
        this.nombre = nombre;
        this.mail = mail;
        this.password = password;
    }


    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //Metodos
    public void agregarCanciones(/*Cancion Tema*/){

    }

    public void elimianarCanciones(/*Cancion Tema*/){

    }

    public void editarPerfil(){

    }

}
