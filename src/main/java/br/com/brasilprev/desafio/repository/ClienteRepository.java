package br.com.brasilprev.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilprev.desafio.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
