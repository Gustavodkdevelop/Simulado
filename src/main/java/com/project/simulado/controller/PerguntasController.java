package com.project.simulado.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerguntasController {

    //LISTAGEM DOS CADASTROS
    @GetMapping("/perguntas")
    public String preguntas(){
        return"listagemFront/Perguntas";
    }
}
