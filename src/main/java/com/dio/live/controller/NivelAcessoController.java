package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.model.NivelAcesso;
import com.dio.live.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel-acesso")
public class NivelAcessoController {

    //new automatico
    @Autowired
    NivelAcessoService service;


    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return service.saveNivelAcesso(nivelAcesso);

    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList() {
        return service.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<NivelAcesso> getNivelAcessoById(@PathVariable("id") Long id) throws Exception {
       return ResponseEntity.ok(service.findById(id));


    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return service.update(nivelAcesso);


    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long id) throws Exception {
        try {
            service.delete(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;


    }
}
