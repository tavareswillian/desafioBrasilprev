package br.com.brasilprev.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilprev.desafio.model.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

}
