package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.model.Empresa;
import com.dio.live.service.CalendarioService;
import com.dio.live.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")

public class EmpresaController {
    @Autowired
    EmpresaService service;


    @PostMapping
    public Empresa create(@RequestBody Empresa empresa) {
        return service.save(empresa);

    }

    @GetMapping
    public List<Empresa> getList() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));


    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa) {
        return service.update(empresa);


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
