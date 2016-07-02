package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Amonestacionreconocimiento;

@Stateless
public class AmonestacionreconocimientoDaoImpl implements AmonestacionreconocimientoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Amonestacionreconocimiento> findAllAmonestacionreconocimiento() {
		return em.createNamedQuery("Amonestacionreconocimiento.findAll").getResultList();
	}

	//@Override
	public Amonestacionreconocimiento findAmonestacionreconocimientoById(Amonestacionreconocimiento amonestacionreconocimiento) {
		return em.find(Amonestacionreconocimiento.class, amonestacionreconocimiento.getIdAmonestacionReconocimiento());
	}

	//@Override
	public void insertAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento) {
		em.persist(amonestacionreconocimiento);
	}

	//@Override
	public void updateAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento) {
		em.merge( amonestacionreconocimiento );
	}

	//@Override
	public void deleteAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento) {
		em.merge(amonestacionreconocimiento);
		em.remove( amonestacionreconocimiento );
	}

}