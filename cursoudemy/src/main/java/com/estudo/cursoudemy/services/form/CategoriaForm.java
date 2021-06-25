package com.estudo.cursoudemy.services.form;

import com.estudo.cursoudemy.domains.Categoria;
import com.estudo.cursoudemy.repositories.CategoriaRepository;

public class CategoriaForm {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Categoria converter() {
        return new Categoria(null, nome);
    }
}
