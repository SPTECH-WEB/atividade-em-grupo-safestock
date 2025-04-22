package com.example.atividade01.service;

import com.example.atividade01.model.Pedido;
import com.example.atividade01.observer.PedidoSubject;
import com.example.atividade01.repository.PedidoRepository;
import com.example.atividade01.repository.PedidoStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final List<PedidoStrategy> pedidoStrategy;
    private final PedidoSubject pedidoSubject;
    private final PedidoRepository pedidoRepository;


    public PedidoService(List<PedidoStrategy> pedidoStrategy, PedidoSubject pedidoSubject, PedidoRepository pedidoRepository) {
        this.pedidoStrategy = pedidoStrategy;
        this.pedidoSubject = pedidoSubject;
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido findById(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado"));
    }


    public List<Pedido> findAll() {
    return pedidoRepository.findAll();
    };

    public Pedido save(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    public double calcular (String categoria, double valor) {
        return pedidoStrategy.stream().filter(e -> e.categoria().equalsIgnoreCase(categoria)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada")).calcular(valor);
    }

    public void processarPedido(Pedido pedido) {
        pedidoSubject.notificarTodos(pedido);
    }
}
