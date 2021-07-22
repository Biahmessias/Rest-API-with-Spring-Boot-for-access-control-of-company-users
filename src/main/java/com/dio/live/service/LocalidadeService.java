package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Localidade;
import com.dio.live.repository.CategoriaUsuarioRepository;
import com.dio.live.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LocalidadeService {

    @Autowired
    LocalidadeRepository repo;

    public Localidade save(Localidade localidade) {
        return repo.save(localidade);
    }


    public List<Localidade> findAll() {
        return repo.findAll();
    }

    public Localidade getById(Long id) throws Exception {
        Optional<Localidade> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Localidade não Encontrada!");
        }
    }


    public Localidade update(Localidade localidade) {
        return repo.save(localidade);
    }

    public void delete(long idLocalidade) {
        repo.deleteById(idLocalidade);
    }
}
