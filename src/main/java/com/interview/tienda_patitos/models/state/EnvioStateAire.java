package com.interview.tienda_patitos.models.state;

import com.interview.tienda_patitos.models.Paquete;

public class EnvioStateAire implements IEnvioState{

    private Paquete contexto;

    public EnvioStateAire(Paquete contexto) {
        this.contexto = contexto;
    }

    @Override
    public void rellenar() {
        if(contexto.getMaterial().equals("Madera") || contexto.getMaterial().equals("Carton")){
            contexto.setRelleno("Bolitas Plastoformo");
        }
        if(contexto.getMaterial().equals("Plastico"))
            contexto.setRelleno("Bolsas con burbuja");
    }
}
