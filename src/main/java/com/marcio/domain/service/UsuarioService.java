package com.marcio.domain.service;

import com.marcio.domain.model.Usuario;

public interface UsuarioService {
    
    Usuario findById(Long id);

    Usuario create (Usuario usuarioCriado);
}
