package com.project.simulado.service;

import com.project.simulado.model.Conteudo;
import com.project.simulado.model.Materias;
import com.project.simulado.repositories.MateriasRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConteudoService {

    MateriasRepository materiasRepository;
    public List<Conteudo> conteudos(Long id){
        Optional<Materias> materiaOp = materiasRepository.findById(id);

        Materias materia = materiaOp.get();
        List<Conteudo> conteudos = materia.getConteudo();
        return conteudos;
    }

}
