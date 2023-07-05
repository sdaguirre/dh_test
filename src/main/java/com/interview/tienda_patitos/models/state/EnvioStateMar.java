package com.interview.tienda_patitos.models.state;

import com.interview.tienda_patitos.models.Paquete;

public class EnvioStateMar implements IEnvioState{

    private Paquete contexto;

    public EnvioStateMar(Paquete contexto) {
        this.contexto = contexto;
    }

    @Override
    public void rellenar() {
        contexto.setRelleno("Bolitas Absorbentes de Humedad, y bolsas con burbuja");
    }
}
