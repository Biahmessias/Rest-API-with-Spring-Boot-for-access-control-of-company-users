package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.TipoData;
import com.dio.live.repository.CategoriaUsuarioRepository;
import com.dio.live.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TipoDataService {

    @Autowired
    TipoDataRepository repo;

    public TipoData save(TipoData tipoData) {
        return repo.save(tipoData);
    }


    public List<TipoData> findAll() {
        return repo.findAll();
    }

    public TipoData getById(Long id) throws Exception {
        Optional<TipoData> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Tipo Data não Encontrada!");
        }
    }


    public TipoData update(TipoData tipoData) {
        return repo.save(tipoData);
    }

    public void delete(long idTipoData) {
        repo.deleteById(idTipoData);
    }
}
