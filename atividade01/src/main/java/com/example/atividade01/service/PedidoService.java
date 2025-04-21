package com.example.atividade01.service;

import com.example.atividade01.model.Pedido;
import com.example.atividade01.observer.PedidoSubject;
import com.example.atividade01.repository.PedidoStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final List<PedidoStrategy> pedidoStrategy;
    private final PedidoSubject pedidoSubject;

    public PedidoService(List<PedidoStrategy> pedidoStrategy, PedidoSubject pedidoSubject) {
        this.pedidoStrategy = pedidoStrategy;
        this.pedidoSubject = pedidoSubject;
    }

    public double calcular (String categoria, double valor) {
        return pedidoStrategy.stream().filter(e -> e.categoria().equalsIgnoreCase(categoria)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada")).calcular(valor);
    }
    public void processarPedido(Pedido pedido) {
        pedidoSubject.notificarTodos(pedido);
    }
}

