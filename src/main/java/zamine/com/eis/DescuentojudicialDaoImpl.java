package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Descuentojudicial;

@Stateless
public class DescuentojudicialDaoImpl implements DescuentojudicialDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Descuentojudicial> findAllDescuentojudicial() {
		return em.createNamedQuery("Descuentojudicial.findAll").getResultList();
	}

	//@Override
	public Descuentojudicial findDescuentojudicialById(Descuentojudicial descuentojudicial) {
		return em.find(Descuentojudicial.class, descuentojudicial.getIdDescuentoJudicial());
	}

	//@Override
	public void insertDescuentojudicial(Descuentojudicial descuentojudicial) {
		em.persist(descuentojudicial);
	}

	//@Override
	public void updateDescuentojudicial(Descuentojudicial descuentojudicial) {
		em.merge( descuentojudicial );
	}

	//@Override
	public void deleteDescuentojudicial(Descuentojudicial descuentojudicial) {
		em.merge(descuentojudicial);
		em.remove( descuentojudicial );
	}

}