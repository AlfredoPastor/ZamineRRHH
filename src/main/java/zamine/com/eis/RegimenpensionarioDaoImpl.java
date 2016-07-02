package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Regimenpensionario;

@Stateless
public class RegimenpensionarioDaoImpl implements RegimenpensionarioDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Regimenpensionario> findAllRegimenpensionario() {
		return em.createNamedQuery("Regimenpensionario.findAll").getResultList();
	}

	//@Override
	public Regimenpensionario findRegimenpensionarioById(Regimenpensionario regimenpensionario) {
		return em.find(Regimenpensionario.class, regimenpensionario.getIdRegimenPensionario());
	}

	//@Override
	public void insertRegimenpensionario(Regimenpensionario regimenpensionario) {
		em.persist(regimenpensionario);
	}

	//@Override
	public void updateRegimenpensionario(Regimenpensionario regimenpensionario) {
		em.merge( regimenpensionario );
	}

	//@Override
	public void deleteRegimenpensionario(Regimenpensionario regimenpensionario) {
		em.merge(regimenpensionario);
		em.remove( regimenpensionario );
	}

}