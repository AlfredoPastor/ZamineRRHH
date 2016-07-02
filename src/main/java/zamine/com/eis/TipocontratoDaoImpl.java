package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Tipocontrato;

@Stateless
public class TipocontratoDaoImpl implements TipocontratoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Tipocontrato> findAllTipocontrato() {
		return em.createNamedQuery("Tipocontrato.findAll").getResultList();
	}

	//@Override
	public Tipocontrato findTipocontratoById(Tipocontrato tipocontrato) {
		return em.find(Tipocontrato.class, tipocontrato.getIdTipoContrato());
	}

	//@Override
	public void insertTipocontrato(Tipocontrato tipocontrato) {
		em.persist(tipocontrato);
	}

	//@Override
	public void updateTipocontrato(Tipocontrato tipocontrato) {
		em.merge( tipocontrato );
	}

	//@Override
	public void deleteTipocontrato(Tipocontrato tipocontrato) {
		em.merge(tipocontrato);
		em.remove( tipocontrato );
	}

}