package com.mysql.spring.app.Controllers;
import java.io.Console;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import com.mysql.spring.app.antlr.prueba;
import org.json.JSONObject;

@RestController
public class treeController {
    @CrossOrigin
    @GetMapping("/tree")
    public String tree() {
        JSONObject result= null;

        try {
            prueba prueba = new prueba();
            result = prueba.obtenerTree();
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}