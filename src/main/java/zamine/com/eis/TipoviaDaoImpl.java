package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Tipovia;

@Stateless
public class TipoviaDaoImpl implements TipoviaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Tipovia> findAllTipovia() {
		return em.createNamedQuery("Tipovia.findAll").getResultList();
	}

	//@Override
	public Tipovia findTipoviaById(Tipovia tipovia) {
		return em.find(Tipovia.class, tipovia.getIdTipoVia());
	}

	//@Override
	public void insertTipovia(Tipovia tipovia) {
		em.persist(tipovia);
	}

	//@Override
	public void updateTipovia(Tipovia tipovia) {
		em.merge( tipovia );
	}

	//@Override
	public void deleteTipovia(Tipovia tipovia) {
		em.merge(tipovia);
		em.remove( tipovia );
	}

}