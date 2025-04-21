package com.example.atividade01.observer;

import com.example.atividade01.model.Pedido;

public interface PedidoObserver {
    void notificar(Pedido pedido);
}

