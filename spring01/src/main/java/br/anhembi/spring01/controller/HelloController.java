package br.anhembi.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é um controller REST
@CrossOrigin("*") // aceita requisições de qualquer origem
@RequestMapping("/hello") // URL = URI = ROTA quando bater no servidor uma requisição com /hello ele já vai saber que é esta classe
public class HelloController {
    @GetMapping // GET este método será acionado
    public String getMessage() {
        return "Boa noite!";
    }
}
