package com.interview.tienda_patitos.controllers;

import com.interview.tienda_patitos.models.Proveedor;
import com.interview.tienda_patitos.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorService service;

    @GetMapping
    public List<Proveedor> getProveedores(){
        return service.getAllProveedores();
    }

    @PostMapping
    public void addProveedor(@RequestBody Proveedor proveedor){
        service.addProveedor(proveedor);
    }
}
