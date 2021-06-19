package com.estudo.cursoudemy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(name = "PEODUTO_CATEGORIA",
//    joinColumns = @JoinColumn(name = "produto_id"),
//    inverseJoinColumns = @JoinColumn(name = "categoris_id"))
//    private List<Categorias> categorias = new ArrayList<>();

    public Produto() {
    }

    public Produto(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public List<Categorias> getCategorias() {
//        return categorias;
//    }
//
//    public void setCategorias(List<Categorias> categorias) {
//        this.categorias = categorias;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return getId().equals(produto.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
