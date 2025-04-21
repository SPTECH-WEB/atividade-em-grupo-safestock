package com.example.atividade01.observer;

import com.example.atividade01.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Nova entrega agendada para " + pedido.getNome());
    }
}
