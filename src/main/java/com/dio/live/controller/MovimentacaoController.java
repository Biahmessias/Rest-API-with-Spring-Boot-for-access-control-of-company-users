package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.model.Movimentacao;
import com.dio.live.service.CalendarioService;
import com.dio.live.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")

public class MovimentacaoController {

    @Autowired
    MovimentacaoService service;


    @PostMapping
    public Movimentacao create(@RequestBody Movimentacao movimentacao) {
        return service.save(movimentacao);

    }

    @GetMapping
    public List<Movimentacao> getList() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));


    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao) {
        return service.update(movimentacao);


    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id) throws Exception {
        try {
            service.delete(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;


    }
}
