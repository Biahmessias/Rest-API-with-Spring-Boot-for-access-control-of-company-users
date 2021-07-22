package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Ocorrencia;
import com.dio.live.repository.CategoriaUsuarioRepository;
import com.dio.live.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository repo;

    public Ocorrencia save(Ocorrencia ocorrencia) {
        return repo.save(ocorrencia);
    }


    public List<Ocorrencia> findAll() {
        return repo.findAll();
    }

    public Ocorrencia getById(Long id) throws Exception {
        Optional<Ocorrencia> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Ocorrencia não Encontrada!");
        }
    }


    public Ocorrencia update(Ocorrencia ocorrencia) {
        return repo.save(ocorrencia);
    }

    public void delete(long idOcorrencia) {
        repo.deleteById(idOcorrencia);
    }
}
