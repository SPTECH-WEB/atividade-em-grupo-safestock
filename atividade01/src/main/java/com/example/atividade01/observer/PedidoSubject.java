package com.example.atividade01.observer;

import com.example.atividade01.model.Pedido;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedidoSubject {

    private final List<PedidoObserver> observers;

    public PedidoSubject(List<PedidoObserver> observers) {
        this.observers = observers;
    }

    public void notificarTodos(Pedido pedido) {
        for (PedidoObserver observer : observers) {
            observer.notificar(pedido);
        }
    }
}

