package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Restaurante;


public interface RestauranteRepository {
	
	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);

}
