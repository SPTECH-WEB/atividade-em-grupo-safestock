package com.example.atividade01.Service;

import com.example.atividade01.Model.Pedido;
import com.example.atividade01.Repository.PedidoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
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