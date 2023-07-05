package com.interview.tienda_patitos.models.decorator;

public abstract class PaqueteDecorator implements ICalcularCostos {

    protected ICalcularCostos decoradorCostos;

    public PaqueteDecorator(ICalcularCostos decoradorCostos) {
        this.decoradorCostos = decoradorCostos;
    }
}
