package br.data.model;

import lombok.Data;

@Data
public class Usuario {

    private String nome;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

}
