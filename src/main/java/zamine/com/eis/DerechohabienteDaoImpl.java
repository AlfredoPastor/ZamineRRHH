package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Derechohabiente;

@Stateless
public class DerechohabienteDaoImpl implements DerechohabienteDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Derechohabiente> findAllDerechohabiente() {
		return em.createNamedQuery("Derechohabiente.findAll").getResultList();
	}

	//@Override
	public Derechohabiente findDerechohabienteById(Derechohabiente derechohabiente) {
		return em.find(Derechohabiente.class, derechohabiente.getIdDerechohabiente());
	}

	//@Override
	public void insertDerechohabiente(Derechohabiente derechohabiente) {
		em.persist(derechohabiente);
	}

	//@Override
	public void updateDerechohabiente(Derechohabiente derechohabiente) {
		em.merge( derechohabiente );
	}

	//@Override
	public void deleteDerechohabiente(Derechohabiente derechohabiente) {
		em.merge(derechohabiente);
		em.remove( derechohabiente );
	}

}