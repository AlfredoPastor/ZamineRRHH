package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Trabajador;

@Stateless
public class TrabajadorDaoImpl implements TrabajadorDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Trabajador> findAllTrabajador() {
		return em.createNamedQuery("Trabajador.findAll").getResultList();
	}

	//@Override
	public Trabajador findTrabajadorById(Trabajador trabajador) {
		return em.find(Trabajador.class, trabajador.getIdTrabajador());
	}

	//@Override
	public void insertTrabajador(Trabajador trabajador) {
		em.persist(trabajador);
	}

	//@Override
	public void updateTrabajador(Trabajador trabajador) {
		em.merge( trabajador );
	}

	//@Override
	public void deleteTrabajador(Trabajador trabajador) {
		em.merge(trabajador);
		em.remove( trabajador );
	}

}