package com.example.atividade01.model;

import com.example.atividade01.repository.PedidoStrategy;
import org.springframework.stereotype.Component;

@Component
public class Economica implements PedidoStrategy {

    @Override
    public double calcular(double valor) {
        return valor += 7.0;
    }

    @Override
    public String categoria() {
        return "Economica";
    }
}
