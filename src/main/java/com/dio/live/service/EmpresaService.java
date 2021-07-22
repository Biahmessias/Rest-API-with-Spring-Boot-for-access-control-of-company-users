package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Empresa;
import com.dio.live.repository.CategoriaUsuarioRepository;
import com.dio.live.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmpresaService {

    @Autowired
    EmpresaRepository repo;

    public Empresa save(Empresa empresa) {
        return repo.save(empresa);
    }


    public List<Empresa> findAll() {
        return repo.findAll();
    }

    public Empresa getById(Long id) throws Exception {
        Optional<Empresa> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Empresa não Encontrada!");
        }
    }


    public Empresa update(Empresa empresa) {
        return repo.save(empresa);
    }

    public void delete(long idEmpresa) {
        repo.deleteById(idEmpresa);
    }
}
