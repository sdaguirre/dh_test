package com.interview.tienda_patitos.models.state;

import com.interview.tienda_patitos.models.Paquete;

public class TamañoStateLarge implements ITamañoState {

    Paquete contexto;

    public TamañoStateLarge(Paquete contexto) {
        this.contexto = contexto;
    }


    @Override
    public void empaquetar() {
        contexto.setMaterial("Madera");
    }
}
