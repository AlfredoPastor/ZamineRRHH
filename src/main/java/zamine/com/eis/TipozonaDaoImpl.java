package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Tipozona;

@Stateless
public class TipozonaDaoImpl implements TipozonaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Tipozona> findAllTipozona() {
		return em.createNamedQuery("Tipozona.findAll").getResultList();
	}

	//@Override
	public Tipozona findTipozonaById(Tipozona tipozona) {
		return em.find(Tipozona.class, tipozona.getIdTipoZona());
	}

	//@Override
	public void insertTipozona(Tipozona tipozona) {
		em.persist(tipozona);
	}

	//@Override
	public void updateTipozona(Tipozona tipozona) {
		em.merge( tipozona );
	}

	//@Override
	public void deleteTipozona(Tipozona tipozona) {
		em.merge(tipozona);
		em.remove( tipozona );
	}

}