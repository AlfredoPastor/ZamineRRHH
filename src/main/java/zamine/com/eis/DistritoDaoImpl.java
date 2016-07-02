package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Distrito;

@Stateless
public class DistritoDaoImpl implements DistritoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Distrito> findAllDistrito() {
		return em.createNamedQuery("Distrito.findAll").getResultList();
	}

	//@Override
	public Distrito findDistritoById(Distrito distrito) {
		return em.find(Distrito.class, distrito.getIdDistrito());
	}

	//@Override
	public void insertDistrito(Distrito distrito) {
		em.persist(distrito);
	}

	//@Override
	public void updateDistrito(Distrito distrito) {
		em.merge( distrito );
	}

	//@Override
	public void deleteDistrito(Distrito distrito) {
		em.merge(distrito);
		em.remove( distrito );
	}

}