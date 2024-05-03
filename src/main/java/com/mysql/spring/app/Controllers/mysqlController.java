package com.mysql.spring.app.Controllers;
import java.io.Console;

import org.springframework.web.bind.annotation.*;

import com.mysql.spring.app.antlr.Test;

@RestController
public class mysqlController {
    @CrossOrigin
    @PostMapping("/compile")
    public String compile(@RequestBody String code) {
        Test compilador = new Test();
        String result;
        System.out.println(code);
        try {
            result = compilador.compile(code);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error durante la compilación: " + e.getMessage();
        }
        return result;
    }

    
}
