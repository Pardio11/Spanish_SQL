package com.mysql.spring.app.Controllers;
import org.springframework.web.bind.annotation.*;
import com.mysql.spring.app.antlr.tablaSql;

@RestController
public class tablaController {

    @CrossOrigin
    @GetMapping("/tabla")
    public String tabla(@RequestParam String database, @RequestParam String tabla) {
        String result = null;
        try {
            tablaSql prueba = new tablaSql();
            result = prueba.getTabla(database, tabla);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}