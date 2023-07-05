package com.interview.tienda_patitos.models;

import com.interview.tienda_patitos.models.decorator.ICalcularCostos;
import com.interview.tienda_patitos.models.state.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Paquete implements ICalcularCostos {

    private String material;
    private String relleno;
    private String pais;

    private ITamañoState tamaño;
    private IEnvioState envio;

    private int cantidad;
    private double precio;

    private List<Adicionales> adicionales;


    public Paquete(Producto.TAMAÑO tamaño, String envio, String pais, int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.pais = pais;
        adicionales = new ArrayList<>();
        switch (tamaño) {
            case XLarge:
            case Large:
                this.tamaño = new TamañoStateLarge(this);
                break;
            case Medium:
                this.tamaño = new TamañoStateMedio(this);
                break;
            case Small:
            case XSMall:
                this.tamaño = new TamañoStateSmall(this);
                break;
            default:
                throw new IllegalArgumentException("Tamaño no permitido");
        }
        switch (envio) {
            case "Aire":
                this.envio = new EnvioStateAire(this);
                break;
            case "Mar":
                this.envio = new EnvioStateMar(this);
                break;
            case "Tierra":
                this.envio = new EnvioStateTierra(this);
                break;
            default:
                throw new IllegalArgumentException("Modo de envío no permitido");
        }
        prepararPaquete();
    }

    public void prepararPaquete() {
        tamaño.empaquetar();
        envio.rellenar();
    }

    @Override
    public double calcularCostos() {
        return cantidad * precio;
    }
}
