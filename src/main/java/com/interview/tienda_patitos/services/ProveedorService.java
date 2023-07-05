package com.interview.tienda_patitos.services;

import com.interview.tienda_patitos.models.Proveedor;
import com.interview.tienda_patitos.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository repository;

    public void addProveedor(Proveedor proveedor){
        repository.save(proveedor);
    }

    public List<Proveedor> getAllProveedores(){
        return repository.findAll();
    }

}
