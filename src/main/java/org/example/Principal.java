package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {
    private static Connection db;
    private static String user = "postgres";
    private static String password = "1234";

    /**
     * Iniciamos la conexion con la base de datos
     */
    public static void initConection() {
        try {
            db = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usuario", user, password);
            System.out.println("Exito");
        } catch (Exception e) {
            System.out.println("Noup");
        }
    }

    /**
     * Cerramos la conexion
     */
    public static void cerrarConexion() {
        try {
            db.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
