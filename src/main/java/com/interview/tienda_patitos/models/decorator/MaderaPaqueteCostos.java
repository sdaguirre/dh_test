package com.interview.tienda_patitos.models.decorator;

public class MaderaPaqueteCostos extends PaqueteDecorator {
    public MaderaPaqueteCostos(ICalcularCostos decoradorCostos) {
        super(decoradorCostos);
    }

    @Override
    public double calcularCostos() {
        return decoradorCostos.calcularCostos() * 1.05;
    }
}
