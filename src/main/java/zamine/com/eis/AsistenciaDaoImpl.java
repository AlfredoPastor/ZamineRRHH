package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Asistencia;

@Stateless
public class AsistenciaDaoImpl implements AsistenciaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Asistencia> findAllAsistencia() {
		return em.createNamedQuery("Asistencia.findAll").getResultList();
	}

	//@Override
	public Asistencia findAsistenciaById(Asistencia asistencia) {
		return em.find(Asistencia.class, asistencia.getIdAsistencia());
	}

	//@Override
	public void insertAsistencia(Asistencia asistencia) {
		em.persist(asistencia);
	}

	//@Override
	public void updateAsistencia(Asistencia asistencia) {
		em.merge( asistencia );
	}

	//@Override
	public void deleteAsistencia(Asistencia asistencia) {
		em.merge(asistencia);
		em.remove( asistencia );
	}

}