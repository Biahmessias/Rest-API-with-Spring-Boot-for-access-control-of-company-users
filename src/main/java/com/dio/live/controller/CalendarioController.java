package com.dio.live.controller;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.Calendario;
import com.dio.live.service.BancoHorasService;
import com.dio.live.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")

public class CalendarioController {
    @Autowired
    CalendarioService service;


    @PostMapping
    public Calendario create(@RequestBody Calendario calendario) {
        return service.save(calendario);

    }

    @GetMapping
    public List<Calendario> getList() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));


    }

    @PutMapping
    public Calendario update(@RequestBody Calendario calendario) {
        return service.update(calendario);


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
