package com.project.simulado.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RespostasController {

    //LISTAGEM DOS CADASTROS
    @GetMapping("/respostas")
    public String respostas(){
        return"listagemFront/Respostas";
    }
}
