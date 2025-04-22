package com.example.atividade01.controller;

import com.example.atividade01.model.Pedido;
import com.example.atividade01.repository.PedidoStrategy;
import com.example.atividade01.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pedidos")
public class PedidoController {
    private final PedidoService pedidoService;
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    };

    @PostMapping
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido) {
        Pedido salvo = pedidoService.save(pedido);
        return ResponseEntity.ok(salvo);
    }

    @PostMapping("/{id}/processar")
    public ResponseEntity<Void> processarPedido(@PathVariable Long id) {
        Pedido pedido = pedidoService.findById(id);
        pedidoService.processarPedido(pedido);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos() {
        List<Pedido> pedidos = pedidoService.findAll();
        return ResponseEntity.ok(pedidos);
    }
}
