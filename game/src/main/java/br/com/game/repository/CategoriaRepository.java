package br.com.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.game.model.Categoria;

@Repository

//Comunica com o Spring 
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
}
