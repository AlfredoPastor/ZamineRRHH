package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Situacioneducativa;

@Stateless
public class SituacioneducativaDaoImpl implements SituacioneducativaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Situacioneducativa> findAllSituacioneducativa() {
		return em.createNamedQuery("Situacioneducativa.findAll").getResultList();
	}

	//@Override
	public Situacioneducativa findSituacioneducativaById(Situacioneducativa situacioneducativa) {
		return em.find(Situacioneducativa.class, situacioneducativa.getIdSituacionEducativa());
	}

	//@Override
	public void insertSituacioneducativa(Situacioneducativa situacioneducativa) {
		em.persist(situacioneducativa);
	}

	//@Override
	public void updateSituacioneducativa(Situacioneducativa situacioneducativa) {
		em.merge( situacioneducativa );
	}

	//@Override
	public void deleteSituacioneducativa(Situacioneducativa situacioneducativa) {
		em.merge(situacioneducativa);
		em.remove( situacioneducativa );
	}

}