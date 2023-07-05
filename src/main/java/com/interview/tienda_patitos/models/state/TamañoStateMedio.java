package com.interview.tienda_patitos.models.state;

import com.interview.tienda_patitos.models.Paquete;

public class TamañoStateMedio implements ITamañoState {

    Paquete contexto;

    public TamañoStateMedio(Paquete contexto) {
        this.contexto = contexto;
    }


    @Override
    public void empaquetar() {
        contexto.setMaterial("Carton");
    }
}
