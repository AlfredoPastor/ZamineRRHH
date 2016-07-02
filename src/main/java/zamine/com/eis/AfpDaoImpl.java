package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Afp;

@Stateless
public class AfpDaoImpl implements AfpDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Afp> findAllAfp() {
		return em.createNamedQuery("Afp.findAll").getResultList();
	}

	//@Override
	public Afp findAfpById(Afp afp) {
		return em.find(Afp.class, afp.getIdAfp());
	}

	//@Override
	public void insertAfp(Afp afp) {
		em.persist(afp);
	}

	//@Override
	public void updateAfp(Afp afp) {
		em.merge( afp );
	}

	//@Override
	public void deleteAfp(Afp afp) {
		em.merge(afp);
		em.remove( afp );
	}

}