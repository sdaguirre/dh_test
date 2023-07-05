package com.interview.tienda_patitos.models.decorator;

public class PlasticoPaqueteCostos extends PaqueteDecorator {
    public PlasticoPaqueteCostos(ICalcularCostos decoradorCostos) {
        super(decoradorCostos);
    }

    @Override
    public double calcularCostos() {
        return decoradorCostos.calcularCostos() * 1.10;
    }
}
