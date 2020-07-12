package br.com.brasilprev.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilprev.desafio.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
