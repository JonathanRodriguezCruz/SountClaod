package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Principal {
    private  static Connection db;
    private static String user = "postgres";
    private static String password = "1234";

    public static void initConection(){
        try{
            db = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usuario",user,password);
            System.out.println("Exito");
        }catch (Exception e){
            System.out.println("Noup");
        }
    }


}
