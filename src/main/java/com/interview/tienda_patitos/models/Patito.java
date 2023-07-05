package com.interview.tienda_patitos.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Patito{
    public enum COLOR {
        Rojo, Verde, Amarillo, Negro
    }

    public enum TAMAÑO {
        XLarge,Large,Medium,Small,XSMall
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean borrado;
    private COLOR color;
    private TAMAÑO tamaño;
    private Double precio;
    private Integer cantidad;

    @ManyToOne
    private Proveedor proveedor;


    public void addCantidad(int cantidad){
        this.cantidad+=cantidad;
    }

    public void substractCantidad(int cantidad) throws Exception {
        if(cantidad> this.cantidad){
            throw new Exception("No se puede vender mas de la cantidad de patitos que existen");
        }
        this.cantidad-=cantidad;
    }
}
