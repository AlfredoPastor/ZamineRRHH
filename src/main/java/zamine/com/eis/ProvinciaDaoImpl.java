package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Provincia;

@Stateless
public class ProvinciaDaoImpl implements ProvinciaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Provincia> findAllProvincia() {
		return em.createNamedQuery("Provincia.findAll").getResultList();
	}

	//@Override
	public Provincia findProvinciaById(Provincia provincia) {
		return em.find(Provincia.class, provincia.getIdProvincia());
	}

	//@Override
	public void insertProvincia(Provincia provincia) {
		em.persist(provincia);
	}

	//@Override
	public void updateProvincia(Provincia provincia) {
		em.merge( provincia );
	}

	//@Override
	public void deleteProvincia(Provincia provincia) {
		em.merge(provincia);
		em.remove( provincia );
	}

}