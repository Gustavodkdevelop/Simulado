package com.project.simulado.controller;
import com.project.simulado.model.Conteudo;
import com.project.simulado.model.Materias;
import com.project.simulado.repositories.ConteudoRepository;
import com.project.simulado.repositories.MateriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller

public class ConteudoController {

    @Autowired
    MateriasRepository materiasRepository;

    //CADASTROS_____________________________________________
    @GetMapping("/cadastroConteudo")
    public String cadastroConteudo() {
        return "cadastro/Conteudo";
    }

    @Autowired
    private ConteudoRepository cr;
    @PostMapping ("/cadastroConteudo/{id}")
    public String form(@PathVariable Long id, Conteudo conteudo){
        Optional<Materias> byId = materiasRepository.findById(id);
        conteudo.setMaterias(byId.get());
        cr.save(conteudo);
        return "redirect:/conteudo";
    }

    @GetMapping ("/conteudo")
    public ModelAndView listaConteudo(){
        ModelAndView mv =new ModelAndView("listagemFront/Conteudo");
        List<Conteudo> conteudo = cr.findAll();
        mv.addObject("students",conteudo);
        return mv;
    }
}