package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.model.Localidade;
import com.dio.live.service.CalendarioService;
import com.dio.live.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")

public class LocalidadeController {
    @Autowired
    LocalidadeService service;


    @PostMapping
    public Localidade create(@RequestBody Localidade localidade) {
        return service.save(localidade);

    }

    @GetMapping
    public List<Localidade> getList() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Localidade> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));


    }

    @PutMapping
    public Localidade update(@RequestBody Localidade localidade) {
        return service.update(localidade);


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
