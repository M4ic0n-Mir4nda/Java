package com.maicon.dev.gof.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
