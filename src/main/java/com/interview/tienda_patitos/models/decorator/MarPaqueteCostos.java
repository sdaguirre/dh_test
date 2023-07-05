package com.interview.tienda_patitos.models.decorator;

public class MarPaqueteCostos extends PaqueteDecorator {
    public MarPaqueteCostos(ICalcularCostos decoradorCostos) {
        super(decoradorCostos);
    }

    @Override
    public double calcularCostos() {
        return decoradorCostos.calcularCostos() + 400;
    }
}
