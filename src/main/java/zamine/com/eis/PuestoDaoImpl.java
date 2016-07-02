package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Puesto;

@Stateless
public class PuestoDaoImpl implements PuestoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Puesto> findAllPuesto() {
		return em.createNamedQuery("Puesto.findAll").getResultList();
	}

	//@Override
	public Puesto findPuestoById(Puesto puesto) {
		return em.find(Puesto.class, puesto.getIdPuesto());
	}

	//@Override
	public void insertPuesto(Puesto puesto) {
		em.persist(puesto);
	}

	//@Override
	public void updatePuesto(Puesto puesto) {
		em.merge( puesto );
	}

	//@Override
	public void deletePuesto(Puesto puesto) {
		em.merge(puesto);
		em.remove( puesto );
	}

}