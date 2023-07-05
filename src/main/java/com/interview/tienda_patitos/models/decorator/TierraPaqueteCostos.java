package com.interview.tienda_patitos.models.decorator;

public class TierraPaqueteCostos extends PaqueteDecorator {
    public TierraPaqueteCostos(ICalcularCostos decoradorCostos) {
        super(decoradorCostos);
    }

    @Override
    public double calcularCostos() {
        return decoradorCostos.calcularCostos() + 10;
    }
}
