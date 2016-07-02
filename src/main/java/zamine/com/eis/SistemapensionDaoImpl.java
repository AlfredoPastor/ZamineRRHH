package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Sistemapension;

@Stateless
public class SistemapensionDaoImpl implements SistemapensionDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Sistemapension> findAllSistemapension() {
		return em.createNamedQuery("Sistemapension.findAll").getResultList();
	}

	//@Override
	public Sistemapension findSistemapensionById(Sistemapension sistemapension) {
		return em.find(Sistemapension.class, sistemapension.getIdSistemaPension());
	}

	//@Override
	public void insertSistemapension(Sistemapension sistemapension) {
		em.persist(sistemapension);
	}

	//@Override
	public void updateSistemapension(Sistemapension sistemapension) {
		em.merge( sistemapension );
	}

	//@Override
	public void deleteSistemapension(Sistemapension sistemapension) {
		em.merge(sistemapension);
		em.remove( sistemapension );
	}

}