package com.example.atividade01.service;

import com.example.atividade01.model.EntregaTransportadora;
import com.example.atividade01.repository.PedidoStrategy;
import org.springframework.stereotype.Service;

@Service("EntregaTransporte")
public class PedidoAdapter implements PedidoStrategy {
    private final EntregaTransportadora entregaTransportadora;

    public PedidoAdapter(EntregaTransportadora entregaTransportadora) {
        this.entregaTransportadora = entregaTransportadora;
    }

    @Override
    public double calcular(double valor) {
        return entregaTransportadora.calcular(valor);
    }

    @Override
    public String categoria() {
        return "EntregaTransporte";
    }
}
