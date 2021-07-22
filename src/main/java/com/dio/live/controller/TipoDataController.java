package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.model.TipoData;
import com.dio.live.service.CalendarioService;
import com.dio.live.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-data")

public class TipoDataController {

    @Autowired
    TipoDataService service;


    @PostMapping
    public TipoData create(@RequestBody TipoData tipoData) {
        return service.save(tipoData);

    }

    @GetMapping
    public List<TipoData> getList() {
        return service.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoData> getById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(service.getById(id));


    }

    @PutMapping
    public TipoData update(@RequestBody TipoData tipoData) {
        return service.update(tipoData);


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
