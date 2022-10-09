package com.gen.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gen.farmacia.model.Categoria;

@Repository // Responsavel pela interação com o Banco de Dados
public interface CategoriaRepository extends JpaRepository<Categoria, Long> { // interface é uma Classe Abstrada
	
	public List <Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);	

}
