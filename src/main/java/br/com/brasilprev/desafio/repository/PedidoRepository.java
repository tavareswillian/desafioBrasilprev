package br.com.brasilprev.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilprev.desafio.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
