package com.project.simulado.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class Respostas implements Serializable {
    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String tipo;
    @Column
    private String conteudo;

    public Respostas(Long id, String tipo, String conteudo) {
        this.id = id;
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
