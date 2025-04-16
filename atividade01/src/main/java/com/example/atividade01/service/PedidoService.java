package com.example.atividade01.service;

import com.example.atividade01.repository.PedidoStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final List<PedidoStrategy> pedidoStrategy;

    public PedidoService(List<PedidoStrategy> pedidoStrategy) {
        this.pedidoStrategy = pedidoStrategy;
    }

    public double calcular (String categoria, double valor) {
        return pedidoStrategy.stream().filter(e -> e.categoria().equalsIgnoreCase(categoria)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada")).calcular(valor);
    }
}