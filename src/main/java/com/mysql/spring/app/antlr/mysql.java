package com.mysql.spring.app.antlr;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {

    public String comandoSQL(String sql) {
        // Establece las credenciales de la base de datos
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = ""; // Reemplaza con tu contraseña real de MySQL

        // Carga el driver JDBC de MySQL


        // Establece la conexión con la base de datos
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            return "EXITO: "+sql+"\n";

        } catch (SQLException e) {
            e.printStackTrace();
            return "ERROR: "+sql+"\n";
        }
    }

    public String comandoBDSQL(String sql,String bd) {
        // Establece las credenciales de la base de datos
        String url = "jdbc:mysql://localhost:3306/"+bd;
        String user = "root";
        String password = ""; // Reemplaza con tu contraseña real de MySQL

        // Carga el driver JDBC de MySQL


        // Establece la conexión con la base de datos
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            return "EXITO: "+sql+"\n";

        } catch (SQLException e) {
            e.printStackTrace();
            return "ERROR: "+sql+"\n";
        }
    }
}
