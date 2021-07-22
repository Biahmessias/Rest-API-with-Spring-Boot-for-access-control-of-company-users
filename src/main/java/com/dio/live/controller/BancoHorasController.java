package com.dio.live.controller;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco-horas")

public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;


    @PostMapping
    public BancoHoras createBanco(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.save(bancoHoras);

    }

    @GetMapping
    public List<BancoHoras> getBancoList() {
        return bancoHorasService.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<BancoHoras> getBancoById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(id));


    }

    @PutMapping
    public BancoHoras updateBanco(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.updateBanco(bancoHoras);


    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable("id") Long id) throws Exception {
        try {
            bancoHorasService.deleteBanco(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return true;


    }

}
