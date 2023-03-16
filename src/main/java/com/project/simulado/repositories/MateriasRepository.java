package com.project.simulado.repositories;

import com.project.simulado.model.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriasRepository extends JpaRepository<Materias, Long> {
}


//@Repository > é usada para indicar que a classe fornece o mecanismo para operação de armazenamento, recuperação, pesquisa, atualização e exclusão em objetos.
// -> (REPOSITORY) > O repositório seria uma classe para buscar informações no banco de dados ou no local onde as informações foram persistidas.
// -> Mas no caso do JpaRepository ele provê a ligação a determinada classe do Model com possibilidade de persistir no banco de dados.