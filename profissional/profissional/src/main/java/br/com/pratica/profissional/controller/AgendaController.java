package br.com.pratica.profissional.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AgendaController {

    @GetMapping("/agenda")
    public String hello_World() {
        return String.format("Olarrr mundo! com GetMapping", HttpStatus.OK);
    }

    @GetMapping(value = "/agenda/{id}")
    public String teste(@PathVariable("id") Integer id) {
        if (id <= 0) {
            return String.format("deu erro", HttpStatus.NOT_FOUND);
        }
        return String.format("opa, certinho!", HttpStatus.OK);

        
    }
}
