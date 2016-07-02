package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Tipoatencion;

@Stateless
public class TipoatencionDaoImpl implements TipoatencionDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Tipoatencion> findAllTipoatencion() {
		return em.createNamedQuery("Tipoatencion.findAll").getResultList();
	}

	//@Override
	public Tipoatencion findTipoatencionById(Tipoatencion tipoatencion) {
		return em.find(Tipoatencion.class, tipoatencion.getIdTipoAtencion());
	}

	//@Override
	public void insertTipoatencion(Tipoatencion tipoatencion) {
		em.persist(tipoatencion);
	}

	//@Override
	public void updateTipoatencion(Tipoatencion tipoatencion) {
		em.merge( tipoatencion );
	}

	//@Override
	public void deleteTipoatencion(Tipoatencion tipoatencion) {
		em.merge(tipoatencion);
		em.remove( tipoatencion );
	}

}