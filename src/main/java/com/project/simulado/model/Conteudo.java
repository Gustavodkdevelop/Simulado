package com.project.simulado.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class Conteudo implements Serializable {
    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private String descricao;

    @ManyToOne
    @JoinColumn(name="id_materia")
    private Materias materias;


    public Conteudo(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Conteudo(){
    }

    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
