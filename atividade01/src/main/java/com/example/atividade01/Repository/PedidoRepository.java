package com.example.atividade01.Repository;

import com.example.atividade01.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    @Query("select p from Pedido p where p.nome = :nome")
    List<Pedido> findByNome(@Param("nome") String nome);
}
