package com.interview.tienda_patitos.models.decorator;

public class AvionPaqueteCostos extends PaqueteDecorator {
    public AvionPaqueteCostos(ICalcularCostos decoradorCostos) {
        super(decoradorCostos);
    }

    @Override
    public double calcularCostos() {
        return decoradorCostos.calcularCostos() + 30;
    }
}
