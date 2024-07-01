package com.marcio.domain.model;

import org.hibernate.mapping.List;



public class Usuario {
    
    private Long id;
    private String nome;
    private Conta conta;
    private Cartao cartao;
    private List<Feature> Features;
    private List<Noticias> noticias;



}
