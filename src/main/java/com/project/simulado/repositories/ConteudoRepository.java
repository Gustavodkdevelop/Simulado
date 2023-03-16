package com.project.simulado.repositories;

import com.project.simulado.model.Conteudo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConteudoRepository extends JpaRepository<Conteudo, Long>{
}
