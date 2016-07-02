package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Experiencialaboral;

@Stateless
public class ExperiencialaboralDaoImpl implements ExperiencialaboralDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Experiencialaboral> findAllExperiencialaboral() {
		return em.createNamedQuery("Experiencialaboral.findAll").getResultList();
	}

	//@Override
	public Experiencialaboral findExperiencialaboralById(Experiencialaboral experiencialaboral) {
		return em.find(Experiencialaboral.class, experiencialaboral.getIdExperienciaLaboral());
	}

	//@Override
	public void insertExperiencialaboral(Experiencialaboral experiencialaboral) {
		em.persist(experiencialaboral);
	}

	//@Override
	public void updateExperiencialaboral(Experiencialaboral experiencialaboral) {
		em.merge( experiencialaboral );
	}

	//@Override
	public void deleteExperiencialaboral(Experiencialaboral experiencialaboral) {
		em.merge(experiencialaboral);
		em.remove( experiencialaboral );
	}

}