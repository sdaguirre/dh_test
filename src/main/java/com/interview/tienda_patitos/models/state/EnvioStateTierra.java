package com.interview.tienda_patitos.models.state;

import com.interview.tienda_patitos.models.Paquete;

public class EnvioStateTierra implements IEnvioState{

    private Paquete contexto;

    public EnvioStateTierra(Paquete contexto) {
        this.contexto = contexto;
    }

    @Override
    public void rellenar() {
        contexto.setRelleno("Bolitas Plastoformo");
    }
}
