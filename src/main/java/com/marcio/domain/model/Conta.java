package com.marcio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) //para dizer que esse numero vai ser unico.
    private String numero;

    private String agencia;

    @Column(nullable = false, scale = 2, precision = 13) //scale é as casas decimais que vai ter.
    private BigDecimal balanco;

    @Column(nullable = false, scale = 2, precision = 13)
    private BigDecimal limite;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNumeroConta() {
        return numero;
    }
    public void setNumeroConta(String numeroConta) {
        this.numero = numeroConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public BigDecimal getBalanco() {
        return balanco;
    }
    public void setBalanco(BigDecimal balanco) {
        this.balanco = balanco;
    }
    public BigDecimal getLimite() {
        return limite;
    }
    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    
}
