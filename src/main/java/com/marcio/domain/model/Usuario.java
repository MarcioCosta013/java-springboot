package com.marcio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL) //o cascade é para quando apagar o usuario apagar tbm a conta;
    private Conta conta;

    @OneToOne(cascade = CascadeType.ALL) //ser para chave estrageira quando for criar o Banco de Dados.
    private Cartao cartao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) //toda vez que buscar um usuario vai trazer as features dele.
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Noticias> noticias;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Cartao getCartao() {
        return cartao;
    }
    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    public List<Noticias> getNoticias() {
        return noticias;
    }
    public void setNoticias(List<Noticias> noticias) {
        this.noticias = noticias;
    }
}
