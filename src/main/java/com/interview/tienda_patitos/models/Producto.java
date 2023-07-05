package com.interview.tienda_patitos.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public abstract class Producto {
    public enum COLOR {
        Rojo, Verde, Amarillo, Negro
    }

    public enum TAMAÑO {
        XLarge,Large,Medium,Small,XSMall
    }

    protected COLOR color;
    protected TAMAÑO tamaño;
    protected Double precio;
    protected Integer cantidad;
}
