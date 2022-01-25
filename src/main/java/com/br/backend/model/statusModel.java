package com.br.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_status")
public class statusModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String status;

    // get and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
