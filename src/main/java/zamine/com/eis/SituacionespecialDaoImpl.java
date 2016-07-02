package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Situacionespecial;

@Stateless
public class SituacionespecialDaoImpl implements SituacionespecialDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Situacionespecial> findAllSituacionespecial() {
		return em.createNamedQuery("Situacionespecial.findAll").getResultList();
	}

	//@Override
	public Situacionespecial findSituacionespecialById(Situacionespecial situacionespecial) {
		return em.find(Situacionespecial.class, situacionespecial.getIdSituacionEspecial());
	}

	//@Override
	public void insertSituacionespecial(Situacionespecial situacionespecial) {
		em.persist(situacionespecial);
	}

	//@Override
	public void updateSituacionespecial(Situacionespecial situacionespecial) {
		em.merge( situacionespecial );
	}

	//@Override
	public void deleteSituacionespecial(Situacionespecial situacionespecial) {
		em.merge(situacionespecial);
		em.remove( situacionespecial );
	}

}