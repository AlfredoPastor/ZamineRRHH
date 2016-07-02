package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Descuento;

@Stateless
public class DescuentoDaoImpl implements DescuentoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Descuento> findAllDescuento() {
		return em.createNamedQuery("Descuento.findAll").getResultList();
	}

	//@Override
	public Descuento findDescuentoById(Descuento descuento) {
		return em.find(Descuento.class, descuento.getIdDescuento());
	}

	//@Override
	public void insertDescuento(Descuento descuento) {
		em.persist(descuento);
	}

	//@Override
	public void updateDescuento(Descuento descuento) {
		em.merge( descuento );
	}

	//@Override
	public void deleteDescuento(Descuento descuento) {
		em.merge(descuento);
		em.remove( descuento );
	}

}