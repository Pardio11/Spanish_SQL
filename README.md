# SQL Spanish Playground

Welcome to the SQL Spanish Playground! This project provides a platform for executing SQL commands on the server with a focus on the Spanish language. It offers three main endpoints for interacting with the SQL database.

## Endpoints

### 1. Obtener Tabla (Get Table)
- **Method:** GET
- **Endpoint:** `/tabla`
- **Parameters:**
  - `database` (String): Nombre de la base de datos (Database name).
  - `tabla` (String): Nombre de la tabla (Table name).
- **Usage:**
  ```javascript
  const response = await axios.get('http://localhost:8080/tabla', {
    params: {
      database: database,
      tabla: tabla,
    },
  });
  ```

### 2. Obtener Estructura de Árbol (Get Tree Structure)
- **Method:** GET
- **Endpoint:** `/tree`
- **Usage:**
  ```javascript
  const response = await axios.get('http://localhost:8080/tree');
  ```

### 3. Compilar Texto SQL (Compile SQL Text)
- **Method:** POST
- **Endpoint:** `/compile`
- **Headers:**
  - `'Content-Type': 'text/plain'` (Indicates sending plain text)
- **Body:**
  - Texto (String): SQL command text.
- **Usage:**
  ```javascript
  const response = await axios.post('http://localhost:8080/compile', texto, {
    headers: {
      'Content-Type': 'text/plain', // Indicar que estás enviando texto plano
    },
  });
  ```

## Setup
1. Ensure you have Java installed on your system. You can download it from [here](https://www.java.com/en/download/).
2. Install the JDBC Driver for MySQL. You can download it from [here](https://dev.mysql.com/downloads/connector/j/).
3. Clone this repository to your local machine.
4. Navigate to the project directory.
5. Build and run the project using your preferred IDE or build tool.

## ANTLR Code
This project includes ANTLR code that translates Spanish SQL to normal SQL. You can find the ANTLR grammar files and related code in the `src/main/antlr` directory.

## Contributing
Contributions are welcome! If you have any ideas or improvements, feel free to open an issue or submit a pull request.

## License
This project is licensed under the [MIT License](LICENSE).
