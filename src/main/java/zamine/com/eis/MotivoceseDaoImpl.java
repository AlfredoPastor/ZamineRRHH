package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Motivocese;

@Stateless
public class MotivoceseDaoImpl implements MotivoceseDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Motivocese> findAllMotivocese() {
		return em.createNamedQuery("Motivocese.findAll").getResultList();
	}

	//@Override
	public Motivocese findMotivoceseById(Motivocese motivocese) {
		return em.find(Motivocese.class, motivocese.getIdMotivoCese());
	}

	//@Override
	public void insertMotivocese(Motivocese motivocese) {
		em.persist(motivocese);
	}

	//@Override
	public void updateMotivocese(Motivocese motivocese) {
		em.merge( motivocese );
	}

	//@Override
	public void deleteMotivocese(Motivocese motivocese) {
		em.merge(motivocese);
		em.remove( motivocese );
	}

}