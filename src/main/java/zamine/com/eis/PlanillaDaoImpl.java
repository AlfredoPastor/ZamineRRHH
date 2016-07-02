package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Planilla;

@Stateless
public class PlanillaDaoImpl implements PlanillaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Planilla> findAllPlanilla() {
		return em.createNamedQuery("Planilla.findAll").getResultList();
	}

	//@Override
	public Planilla findPlanillaById(Planilla planilla) {
		return em.find(Planilla.class, planilla.getIdPlanilla());
	}

	//@Override
	public void insertPlanilla(Planilla planilla) {
		em.persist(planilla);
	}

	//@Override
	public void updatePlanilla(Planilla planilla) {
		em.merge( planilla );
	}

	//@Override
	public void deletePlanilla(Planilla planilla) {
		em.merge(planilla);
		em.remove( planilla );
	}

}