package com.example.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.model.Cozinha;
import com.example.demo.domain.repository.CozinhaRepository;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

	@PersistenceContext
	private EntityManager maneger;
	@Override
	public List<Cozinha> listar(){
		return maneger.createQuery("from Cozinha", Cozinha.class)
				.getResultList();
	}
	@Override
	public Cozinha buscar(Long id) {
		return maneger.find(Cozinha.class, id);
	}
	@Transactional
	public Cozinha salvar(Cozinha cozinha) {
		return maneger.merge(cozinha);
	}
	@Override
	public void remover(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());
		maneger.remove(cozinha);
	}

	

}
