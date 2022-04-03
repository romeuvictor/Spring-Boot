package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);
}
