package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.model.CategoriaUsuario;
import com.dio.live.service.CalendarioService;
import com.dio.live.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria-usuario")

public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService service;


    @PostMapping
    public CategoriaUsuario create(@RequestBody CategoriaUsuario categoriaUsuario) {
        return service.save(categoriaUsuario);

    }

    @GetMapping
    public List<CategoriaUsuario> getList() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaUsuario> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));


    }

    @PutMapping
    public CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario) {
        return service.update(categoriaUsuario);


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
