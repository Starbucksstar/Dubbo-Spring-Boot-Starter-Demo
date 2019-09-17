package com.star.dubboprovider.api.dto;

import java.io.Serializable;

public class UserKeyDTO implements Serializable {
    private Long id;
    private String idno;

    public UserKeyDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdno() {
        return this.idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }
}