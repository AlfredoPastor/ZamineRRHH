package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Descansomedico;

@Stateless
public class DescansomedicoDaoImpl implements DescansomedicoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Descansomedico> findAllDescansomedico() {
		return em.createNamedQuery("Descansomedico.findAll").getResultList();
	}

	//@Override
	public Descansomedico findDescansomedicoById(Descansomedico descansomedico) {
		return em.find(Descansomedico.class, descansomedico.getIdDescansoMedico());
	}

	//@Override
	public void insertDescansomedico(Descansomedico descansomedico) {
		em.persist(descansomedico);
	}

	//@Override
	public void updateDescansomedico(Descansomedico descansomedico) {
		em.merge( descansomedico );
	}

	//@Override
	public void deleteDescansomedico(Descansomedico descansomedico) {
		em.merge(descansomedico);
		em.remove( descansomedico );
	}

}