package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;


    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        //jornadaRepository.
        return jornadaRepository.save(jornadaTrabalho);

    }


    public List<JornadaTrabalho> findAll() {
       return jornadaRepository.findAll();
    }

    public JornadaTrabalho getById(Long id) throws Exception {
        Optional<JornadaTrabalho> optional = jornadaRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }else {
            throw new Exception("Jornada de Trabalho não Encontrada!");
        }

    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }


    public void deleteJornada(long idjornada) {
        jornadaRepository.deleteById(idjornada);

    }
}
