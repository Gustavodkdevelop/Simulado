package com.project.simulado.controller;

import com.project.simulado.model.Conteudo;
import com.project.simulado.model.Materias;
import com.project.simulado.repositories.MateriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.project.simulado.service.ConteudoService;

import java.util.List;

@Controller
@RequestMapping("/materias")
public class MateriasController {

    @Autowired
    ConteudoService conteudoService;

    Long materiaId;

    //CADASTROS_____________________________________________
    @GetMapping("/cadastroMaterias")
    public String cadastroMaterias() {
        return "cadastro/Materias";
    }

    @GetMapping("/{id}")
    public ModelAndView buscarConteudo(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("listagemFront/Conteudo");
        List<Conteudo> conteudoList = conteudoService.conteudos(id);
        mv.addObject("conteudoList",conteudoList);
        return mv;
    }

    @Autowired
    private MateriasRepository mr;
    @RequestMapping(value = "/cadastroMaterias", method = RequestMethod.POST)
    public String form(Materias materias){
        mr.save(materias);
        return "redirect:/materias/";
    }
    //_______________________________________________________________________

  @GetMapping("/")
    public ModelAndView listaMaterias(){
        ModelAndView mv =new ModelAndView("listagemFront/Materias");
        List<Materias> materias = mr.findAll();
        mv.addObject("materias",materias);
        return mv;
    }

//    @RequestMapping("/deletar")
//    public String deletarMateria(long id){
//        Materias materias = mr.findBy(id);
//        mr.delete(materias);
//        return "redirect:/materias";
//    }
}


