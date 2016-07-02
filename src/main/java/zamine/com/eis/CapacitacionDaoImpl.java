package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Capacitacion;

@Stateless
public class CapacitacionDaoImpl implements CapacitacionDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Capacitacion> findAllCapacitacion() {
		return em.createNamedQuery("Capacitacion.findAll").getResultList();
	}

	//@Override
	public Capacitacion findCapacitacionById(Capacitacion capacitacion) {
		return em.find(Capacitacion.class, capacitacion.getIdCapacitacion());
	}

	//@Override
	public void insertCapacitacion(Capacitacion capacitacion) {
		em.persist(capacitacion);
	}

	//@Override
	public void updateCapacitacion(Capacitacion capacitacion) {
		em.merge( capacitacion );
	}

	//@Override
	public void deleteCapacitacion(Capacitacion capacitacion) {
		em.merge(capacitacion);
		em.remove( capacitacion );
	}

}