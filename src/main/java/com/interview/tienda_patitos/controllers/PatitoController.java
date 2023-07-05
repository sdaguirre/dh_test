package com.interview.tienda_patitos.controllers;

import com.interview.tienda_patitos.models.Patito;
import com.interview.tienda_patitos.services.PatitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patitos")
public class PatitoController {

    @Autowired
    private PatitoService service;

    @GetMapping()
    public ResponseEntity<List<Patito>> getAllPatitos(){
        return ResponseEntity.ok(service.getAllPatitos());
    }

    @PostMapping()
    public ResponseEntity<Patito> insertPatito(@RequestBody Patito patito){
        service.addPatito(patito);
        return ResponseEntity.ok(patito);
    }

    @PatchMapping()
    public ResponseEntity<Patito> updatePatito(@RequestBody Patito patito){
        return ResponseEntity.ok(service.updatePatito(patito));
    }

    @DeleteMapping("/{patito_id}")
    public ResponseEntity<String> deletePatito(@PathVariable Integer patito_id){
        service.removePatito(patito_id);
        return ResponseEntity.ok("Patito eliminado");
    }

}
