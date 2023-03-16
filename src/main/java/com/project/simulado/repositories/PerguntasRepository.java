package com.project.simulado.repositories;

import com.project.simulado.model.Perguntas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerguntasRepository extends JpaRepository<Perguntas, Long> {
}

