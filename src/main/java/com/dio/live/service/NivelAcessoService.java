package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.model.NivelAcesso;
import com.dio.live.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    private NivelAcessoRepository repo;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository repo) {
        this.repo = repo;
    }

    public List<NivelAcesso> findAll() {
        return this.repo.findAll();
    }

    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso) {
        return repo.save(nivelAcesso);
    }


    public NivelAcesso findById (long id) throws Exception {
        Optional<NivelAcesso> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }else {
            throw new Exception("Nivel de Acesso não Encontrado!");
        }


    }

    public NivelAcesso update (NivelAcesso nivelAcesso){
        return repo.save(nivelAcesso);
    }

    public void delete(long idAcesso){
        repo.deleteById(idAcesso);
    }
}
