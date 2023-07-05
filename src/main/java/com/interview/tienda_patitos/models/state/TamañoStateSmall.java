package com.interview.tienda_patitos.models.state;

import com.interview.tienda_patitos.models.Paquete;

public class TamañoStateSmall implements ITamañoState {

    Paquete contexto;

    public TamañoStateSmall(Paquete contexto) {
        this.contexto = contexto;
    }


    @Override
    public void empaquetar() {
        contexto.setMaterial("Plastico");
    }
}
