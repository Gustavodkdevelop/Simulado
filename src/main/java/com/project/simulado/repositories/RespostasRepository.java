package com.project.simulado.repositories;

import com.project.simulado.model.Respostas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostasRepository extends JpaRepository<Respostas, Long> {
}

