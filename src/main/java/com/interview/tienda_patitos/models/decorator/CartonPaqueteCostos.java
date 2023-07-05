package com.interview.tienda_patitos.models.decorator;

public class CartonPaqueteCostos extends PaqueteDecorator {
    public CartonPaqueteCostos(ICalcularCostos decoradorCostos) {
        super(decoradorCostos);
    }

    @Override
    public double calcularCostos() {
        return decoradorCostos.calcularCostos() * 0.99;
    }
}
