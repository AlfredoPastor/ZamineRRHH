package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Cuentabancaria;

@Stateless
public class CuentabancariaDaoImpl implements CuentabancariaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Cuentabancaria> findAllCuentabancaria() {
		return em.createNamedQuery("Cuentabancaria.findAll").getResultList();
	}

	//@Override
	public Cuentabancaria findCuentabancariaById(Cuentabancaria cuentabancaria) {
		return em.find(Cuentabancaria.class, cuentabancaria.getIdCuentaBancaria());
	}

	//@Override
	public void insertCuentabancaria(Cuentabancaria cuentabancaria) {
		em.persist(cuentabancaria);
	}

	//@Override
	public void updateCuentabancaria(Cuentabancaria cuentabancaria) {
		em.merge( cuentabancaria );
	}

	//@Override
	public void deleteCuentabancaria(Cuentabancaria cuentabancaria) {
		em.merge(cuentabancaria);
		em.remove( cuentabancaria );
	}

}