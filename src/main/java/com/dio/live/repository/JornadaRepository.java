package com.dio.live.repository;

import com.dio.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
    //List <JornadaTrabalho> findByDescricao(String descricao);
}
