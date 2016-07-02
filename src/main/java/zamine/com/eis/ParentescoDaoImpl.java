package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Parentesco;

@Stateless
public class ParentescoDaoImpl implements ParentescoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Parentesco> findAllParentesco() {
		return em.createNamedQuery("Parentesco.findAll").getResultList();
	}

	//@Override
	public Parentesco findParentescoById(Parentesco parentesco) {
		return em.find(Parentesco.class, parentesco.getIdParentesco());
	}

	//@Override
	public void insertParentesco(Parentesco parentesco) {
		em.persist(parentesco);
	}

	//@Override
	public void updateParentesco(Parentesco parentesco) {
		em.merge( parentesco );
	}

	//@Override
	public void deleteParentesco(Parentesco parentesco) {
		em.merge(parentesco);
		em.remove( parentesco );
	}

}