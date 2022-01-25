package com.br.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_burger")
public class burgerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String nome;

    public String carne;

    public String pao;

    public String[] opcionais;

    public String status;

    // get and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String[] getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String[] opcionais) {
        this.opcionais = opcionais;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
