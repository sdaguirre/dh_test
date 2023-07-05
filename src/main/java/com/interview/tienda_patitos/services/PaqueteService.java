package com.interview.tienda_patitos.services;

import com.interview.tienda_patitos.models.Producto;
import com.interview.tienda_patitos.models.Paquete;
import org.springframework.stereotype.Service;

@Service
public class PaqueteService {

    public void prepararPaquete(Producto producto, String pais, String modo_envío) {

        Paquete paquete = new Paquete(producto.getTamaño(), modo_envío, pais, producto.getCantidad(), producto.getPrecio());


    }

}
