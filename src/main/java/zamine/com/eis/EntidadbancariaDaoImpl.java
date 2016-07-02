package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Entidadbancaria;

@Stateless
public class EntidadbancariaDaoImpl implements EntidadbancariaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Entidadbancaria> findAllEntidadbancaria() {
		return em.createNamedQuery("Entidadbancaria.findAll").getResultList();
	}

	//@Override
	public Entidadbancaria findEntidadbancariaById(Entidadbancaria entidadbancaria) {
		return em.find(Entidadbancaria.class, entidadbancaria.getIdEntidadBancaria());
	}

	//@Override
	public void insertEntidadbancaria(Entidadbancaria entidadbancaria) {
		em.persist(entidadbancaria);
	}

	//@Override
	public void updateEntidadbancaria(Entidadbancaria entidadbancaria) {
		em.merge( entidadbancaria );
	}

	//@Override
	public void deleteEntidadbancaria(Entidadbancaria entidadbancaria) {
		em.merge(entidadbancaria);
		em.remove( entidadbancaria );
	}

}