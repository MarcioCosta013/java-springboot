package com.marcio.domain.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.marcio.domain.model.Usuario;
import com.marcio.domain.repository.UsuarioRepository;
import com.marcio.domain.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public Usuario findById(Long id) {
        
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioCriado) {
        if(usuarioRepository.existsByContaNumero(usuarioCriado.getConta().getNumeroConta())){
            throw new IllegalArgumentException("Esse numero da conta ja existe!");
        }
        return usuarioRepository.save(usuarioCriado);
    }
    
}
