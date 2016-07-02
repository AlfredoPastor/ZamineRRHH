package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Vacacion;

@Stateless
public class VacacionDaoImpl implements VacacionDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Vacacion> findAllVacacion() {
		return em.createNamedQuery("Vacacion.findAll").getResultList();
	}

	//@Override
	public Vacacion findVacacionById(Vacacion vacacion) {
		return em.find(Vacacion.class, vacacion.getIdVacacion());
	}

	//@Override
	public void insertVacacion(Vacacion vacacion) {
		em.persist(vacacion);
	}

	//@Override
	public void updateVacacion(Vacacion vacacion) {
		em.merge( vacacion );
	}

	//@Override
	public void deleteVacacion(Vacacion vacacion) {
		em.merge(vacacion);
		em.remove( vacacion );
	}

}