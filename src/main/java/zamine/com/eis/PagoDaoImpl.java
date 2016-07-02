package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Pago;

@Stateless
public class PagoDaoImpl implements PagoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Pago> findAllPago() {
		return em.createNamedQuery("Pago.findAll").getResultList();
	}

	//@Override
	public Pago findPagoById(Pago pago) {
		return em.find(Pago.class, pago.getIdPago());
	}

	//@Override
	public void insertPago(Pago pago) {
		em.persist(pago);
	}

	//@Override
	public void updatePago(Pago pago) {
		em.merge( pago );
	}

	//@Override
	public void deletePago(Pago pago) {
		em.merge(pago);
		em.remove( pago );
	}

}