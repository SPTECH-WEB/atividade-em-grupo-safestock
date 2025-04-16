package com.example.atividade01.Model;

import com.example.atividade01.Repository.PedidoStrategy;
import org.springframework.stereotype.Component;

@Component
public class Expressa implements PedidoStrategy {

    @Override
    public double calcular (double valor) {
        return valor * 1.6 + 8.0;
    }

    @Override
    public String categoria() {
        return "Expressa";
    }
}
