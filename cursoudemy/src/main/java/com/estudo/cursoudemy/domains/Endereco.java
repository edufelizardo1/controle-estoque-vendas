package com.estudo.cursoudemy.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradoruro;
    private String numero;
    private String complemeno;
    private String bairro;
    private String cep;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(Integer id, String logradoruro, String numero, String complemeno,
                    String bairro, String cep, Cliente cliente, Cidade cidade) {
        this.id = id;
        this.logradoruro = logradoruro;
        this.numero = numero;
        this.complemeno = complemeno;
        this.bairro = bairro;
        this.cep = cep;
        this.cliente = cliente;
        this.cidade = cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradoruro() {
        return logradoruro;
    }

    public void setLogradoruro(String logradoruro) {
        this.logradoruro = logradoruro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemeno() {
        return complemeno;
    }

    public void setComplemeno(String complemeno) {
        this.complemeno = complemeno;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;
        Endereco endereco = (Endereco) o;
        return getId().equals(endereco.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
