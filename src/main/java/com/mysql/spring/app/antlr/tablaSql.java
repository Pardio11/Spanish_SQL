package com.mysql.spring.app.antlr;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class tablaSql {
    
public String getTabla(String database, String tabla) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/" + database;
    String usuario = "root";
    String contraseña = "";

    try {
        // Establecer la conexión con la base de datos
        Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

        // Crear una declaración SQL
        Statement statement = conexion.createStatement();

        // Crear una declaración SQL
        String consultaSQL = "SELECT * FROM "+tabla;
        
        // Ejecutar la consulta SELECT
        ResultSet resultSet = statement.executeQuery(consultaSQL);
        
        // Obtener metadatos de resultado para obtener nombres de columnas
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        // Convertir los resultados a una lista de mapas (columna -> valor)
        List<Map<String, Object>> resultados = new ArrayList<>();
        Map<String, Object> filaStart = new HashMap<>();
            for (int i = 1; i <= columnCount; i++) {
                String nombreColumnaStart = metaData.getColumnName(i);
                Object valorColumnaStart = null;
                filaStart.put(nombreColumnaStart, valorColumnaStart);
            }
            resultados.add(filaStart);
            boolean clear = true;
        while (resultSet.next()) {
            if(clear){
                resultados.clear();
                clear = false;
            }
        
            Map<String, Object> fila = new HashMap<>();
            for (int i = 1; i <= columnCount; i++) {
                String nombreColumna = metaData.getColumnName(i);
                Object valorColumna = resultSet.getObject(i);
                fila.put(nombreColumna, valorColumna);
            }
            resultados.add(fila);
        }
        
        // Convertir la lista de resultados a JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(resultados);
        

        
        // Cerrar la conexión y liberar recursos
        resultSet.close();
        statement.close();
        conexion.close();

        return json;
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("aqui");
        return null;
    }
}

}
