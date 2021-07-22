package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.Calendario;
import com.dio.live.repository.BancoHorasRepository;
import com.dio.live.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CalendarioService {
    @Autowired
    CalendarioRepository repo;

    public Calendario save(Calendario calendario) {

        return repo.save(calendario);
    }


    public List<Calendario> findAll() {
        return repo.findAll();
    }

    public Calendario getById(Long id) throws Exception {
        Optional<Calendario> optional = repo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new Exception("Calendario não Encontrado!");
        }
    }


    public Calendario update(Calendario calendario) {
        return repo.save(calendario);
    }

    public void delete(long idCalendario) {
        repo.deleteById(idCalendario);
    }

}
