package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    @Autowired
    BancoHorasRepository bancoRepository;

    public BancoHoras save(BancoHoras banco) {
        return bancoRepository.save(banco);
    }


    public List<BancoHoras> findAll() {
        return bancoRepository.findAll();
    }

    public BancoHoras getById(Long id) throws Exception {
        Optional<BancoHoras> optional = bancoRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Banco de Horas não Encontrado!");
        }
    }


    public BancoHoras updateBanco(BancoHoras bancoHoras) {
        return bancoRepository.save(bancoHoras);
    }

    public void deleteBanco(long idBanco) {
        bancoRepository.deleteById(idBanco);
    }
}
