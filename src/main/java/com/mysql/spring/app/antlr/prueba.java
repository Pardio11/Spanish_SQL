package com.mysql.spring.app.antlr;

import java.sql.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class prueba {
    public JSONObject obtenerTree() {
        String url = "jdbc:mysql://localhost:3306/"; // URL base
        String usuario = "root"; // Usuario de la base de datos
        String contraseña = ""; // Contraseña de la base de datos

        try {
            // Cargar el driver de JDBC para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conectar al servidor MySQL sin especificar una base de datos
            try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
                 Statement statement = conexion.createStatement();
                 ResultSet rsDatabases = statement.executeQuery("SHOW DATABASES")) {

                JSONObject allDatabasesJson = new JSONObject();

                // Iterar sobre cada base de datos
                while (rsDatabases.next()) {
                    String databaseName = rsDatabases.getString(1);
                    JSONArray databaseJson = new JSONArray();
                    // Conectar a cada base de datos
                    try (Connection dbConnection = DriverManager.getConnection(url + databaseName, usuario, contraseña)) {

                        Statement stmtDB = dbConnection.createStatement();
                        try (ResultSet rsTables = stmtDB.executeQuery("Show tables");) {
                            int i=0;
                            while (rsTables.next()) {
                                i++;
                                String tableName = rsTables.getString(1);
                                databaseJson.put( tableName);
                            }
                        }
                    }
                    allDatabasesJson.put(databaseName, databaseJson);
                }
                return allDatabasesJson;
                // Imprimir el JSON con la información de todas las bases de datos// El '4' es para una indentación bonita
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
            return null;
        }
        
    }
}
