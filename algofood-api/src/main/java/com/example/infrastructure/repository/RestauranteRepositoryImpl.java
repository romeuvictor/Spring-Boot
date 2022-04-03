package com.example.infrastructure.repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.domain.model.Restaurante;
import com.example.demo.domain.repository.RestauranteRepository;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository{

		@PersistenceContext
		private EntityManager maneger;
		@Override
		public List<Restaurante> listar(){
			return maneger.createQuery("from Restaurante", Restaurante.class)
					.getResultList();
		}
		@Override
		public Restaurante buscar(Long id) {
			return maneger.find(Restaurante.class, id);
		}
		@Transactional
		public Restaurante salvar(Restaurante restaurante) {
			return maneger.merge(restaurante);
		}
		@Override
		public void remover(Restaurante restaurante) {
			restaurante = buscar(restaurante.getId());
			maneger.remove(restaurante);
		}

		

	}