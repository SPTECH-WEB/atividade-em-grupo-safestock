package com.example.atividade01.observer;

import com.example.atividade01.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class LogObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Pedido registrado no sistema: ID " + pedido.getId());
    }
}
