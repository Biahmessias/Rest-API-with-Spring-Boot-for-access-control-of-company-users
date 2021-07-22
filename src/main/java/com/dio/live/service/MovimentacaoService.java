package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Movimentacao;
import com.dio.live.repository.CategoriaUsuarioRepository;
import com.dio.live.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MovimentacaoService {

    @Autowired
    MovimentacaoRepository repo;

    public Movimentacao save(Movimentacao movimentacao) {
        return repo.save(movimentacao);
    }


    public List<Movimentacao> findAll() {
        return repo.findAll();
    }

    public Movimentacao getById(Long id) throws Exception {
        Optional<Movimentacao> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Movimentação não Encontrada!");
        }
    }


    public Movimentacao update(Movimentacao movimentacao) {
        return repo.save(movimentacao);
    }

    public void delete(long idMovimentacao) {
        repo.deleteById(idMovimentacao);
    }
}
