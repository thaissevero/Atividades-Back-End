package com.generation.GameStore.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.GameStore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findByNomeContainingIgnoreCase(@Param("nome") String nome);

	public Object findByPrecoContainingIgnoreCase(BigDecimal preco);

}
