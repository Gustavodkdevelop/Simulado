package com.project.simulado.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //LISTAGEM DOS CADASTROS
    @GetMapping("/home")
    public String home(){
        return"listagemFront/Home";
    }
}


