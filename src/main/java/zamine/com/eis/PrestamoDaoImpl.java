package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Prestamo;

@Stateless
public class PrestamoDaoImpl implements PrestamoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Prestamo> findAllPrestamo() {
		return em.createNamedQuery("Prestamo.findAll").getResultList();
	}

	//@Override
	public Prestamo findPrestamoById(Prestamo prestamo) {
		return em.find(Prestamo.class, prestamo.getIdPrestamo());
	}

	//@Override
	public void insertPrestamo(Prestamo prestamo) {
		em.persist(prestamo);
	}

	//@Override
	public void updatePrestamo(Prestamo prestamo) {
		em.merge( prestamo );
	}

	//@Override
	public void deletePrestamo(Prestamo prestamo) {
		em.merge(prestamo);
		em.remove( prestamo );
	}

}