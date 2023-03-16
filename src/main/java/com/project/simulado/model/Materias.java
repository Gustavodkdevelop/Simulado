package com.project.simulado.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
public class Materias implements Serializable {
    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private String descricao;

    @OneToMany(mappedBy = "materias")
    private List<Conteudo> conteudo;

    public Materias(Long id, String nome, String descricao, List<Conteudo> conteudo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.conteudo = conteudo;
    }

    public Materias(){
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

    public List<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(List<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    public Long add(Materias materias) {
        return null;
    }

    public Long size() {
        return null;
    }
}

