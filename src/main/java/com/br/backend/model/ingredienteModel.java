package com.br.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_ingredientes")
public class ingredienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String pao;

    public String carne;

    public String opcionais;

    // get and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }
}
