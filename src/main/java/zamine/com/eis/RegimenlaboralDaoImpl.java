package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Regimenlaboral;

@Stateless
public class RegimenlaboralDaoImpl implements RegimenlaboraDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Regimenlaboral> findAllRegimenlabora() {
		return em.createNamedQuery("Regimenlabora.findAll").getResultList();
	}

	//@Override
	public Regimenlaboral findRegimenlaboraById(Regimenlaboral regimenlabora) {
		return em.find(Regimenlaboral.class, regimenlabora.getIdRegimenLaboral());
	}

	//@Override
	public void insertRegimenlabora(Regimenlaboral regimenlabora) {
		em.persist(regimenlabora);
	}

	//@Override
	public void updateRegimenlabora(Regimenlaboral regimenlabora) {
		em.merge( regimenlabora );
	}

	//@Override
	public void deleteRegimenlabora(Regimenlaboral regimenlabora) {
		em.merge(regimenlabora);
		em.remove( regimenlabora );
	}

}