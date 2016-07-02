package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Autorizacion;

@Stateless
public class AutorizacionDaoImpl implements AutorizacionDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Autorizacion> findAllAutorizacion() {
		return em.createNamedQuery("Autorizacion.findAll").getResultList();
	}

	//@Override
	public Autorizacion findAutorizacionById(Autorizacion autorizacion) {
		return em.find(Autorizacion.class, autorizacion.getIdAutorizacion());
	}

	//@Override
	public void insertAutorizacion(Autorizacion autorizacion) {
		em.persist(autorizacion);
	}

	//@Override
	public void updateAutorizacion(Autorizacion autorizacion) {
		em.merge( autorizacion );
	}

	//@Override
	public void deleteAutorizacion(Autorizacion autorizacion) {
		em.merge(autorizacion);
		em.remove( autorizacion );
	}

}