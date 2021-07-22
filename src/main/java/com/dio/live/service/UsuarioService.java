package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.Usuario;
import com.dio.live.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {

    @Autowired
    UsuarioRepository repo;

    public Usuario save(Usuario usuario) {
        return repo.save(usuario);
    }

    public List<Usuario> findAll() {
        return repo.findAll();
    }


    public Usuario getById(Long id) throws Exception {
        Optional<Usuario> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Usuario não Encontrado!");
        }
    }

    public Usuario updateUsuario(Usuario usuario) {
        return repo.save(usuario);
    }


    public void deleteUsuario(long idUsuario) {
        repo.deleteById(idUsuario);
    }
}


