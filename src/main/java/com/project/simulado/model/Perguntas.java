package com.project.simulado.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class Perguntas implements Serializable {
    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String enunciado;
    @Column
    private String tipo;

    public Perguntas(Long id, String enunciado, String tipo) {
        this.id = id;
        this.enunciado = enunciado;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
