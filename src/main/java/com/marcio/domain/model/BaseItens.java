package com.marcio.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItens {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icone;
    private String descrisao;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIcone() {
        return icone;
    }
    public void setIcone(String icone) {
        this.icone = icone;
    }
    public String getDescrisao() {
        return descrisao;
    }
    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }

}
