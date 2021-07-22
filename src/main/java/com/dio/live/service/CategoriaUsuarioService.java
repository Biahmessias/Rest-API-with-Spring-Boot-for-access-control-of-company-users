package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.CategoriaUsuario;
import com.dio.live.repository.BancoHorasRepository;
import com.dio.live.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    CategoriaUsuarioRepository repo;

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario) {
        return repo.save(categoriaUsuario);
    }


    public List<CategoriaUsuario> findAll() {
        return repo.findAll();
    }

    public CategoriaUsuario getById(Long id) throws Exception {
        Optional<CategoriaUsuario> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Categoria de Usuario não Encontrada!");
        }
    }


    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario) {
        return repo.save(categoriaUsuario);
    }

    public void delete(long idCategoriaUsuario) {
        repo.deleteById(idCategoriaUsuario);
    }
}
