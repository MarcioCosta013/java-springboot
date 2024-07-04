package com.marcio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcio.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByContaNumero(String NumeroConta);
    
}
