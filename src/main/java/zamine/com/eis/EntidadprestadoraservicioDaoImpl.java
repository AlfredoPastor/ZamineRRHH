package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Entidadprestadoraservicio;

@Stateless
public class EntidadprestadoraservicioDaoImpl implements EntidadprestadoraservicioDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Entidadprestadoraservicio> findAllEntidadprestadoraservicio() {
		return em.createNamedQuery("Entidadprestadoraservicio.findAll").getResultList();
	}

	//@Override
	public Entidadprestadoraservicio findEntidadprestadoraservicioById(Entidadprestadoraservicio entidadprestadoraservicio) {
		return em.find(Entidadprestadoraservicio.class, entidadprestadoraservicio.getIdEntidadPrestadoraServicio());
	}

	//@Override
	public void insertEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio) {
		em.persist(entidadprestadoraservicio);
	}

	//@Override
	public void updateEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio) {
		em.merge( entidadprestadoraservicio );
	}

	//@Override
	public void deleteEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio) {
		em.merge(entidadprestadoraservicio);
		em.remove( entidadprestadoraservicio );
	}

}