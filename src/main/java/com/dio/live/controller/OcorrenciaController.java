package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.model.Ocorrencia;
import com.dio.live.service.CalendarioService;
import com.dio.live.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")

public class OcorrenciaController {

    @Autowired
    OcorrenciaService service;


    @PostMapping
    public Ocorrencia create(@RequestBody Ocorrencia ocorrencia) {
        return service.save(ocorrencia);

    }

    @GetMapping
    public List<Ocorrencia> getList() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));


    }

    @PutMapping
    public Ocorrencia update(@RequestBody Ocorrencia ocorrencia) {
        return service.update(ocorrencia);


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
