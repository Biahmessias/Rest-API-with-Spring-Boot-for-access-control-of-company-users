package com.dio.live.controller;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.Usuario;
import com.dio.live.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

    @Autowired
    UsuarioService uservice;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return uservice.save(usuario);

    }

    @GetMapping
    public List<Usuario> getUsuarioList() {
        return uservice.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(uservice.getById(id));

    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return uservice.updateUsuario(usuario);


    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id) throws Exception {
        try {
            uservice.deleteUsuario(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;


    }
}
