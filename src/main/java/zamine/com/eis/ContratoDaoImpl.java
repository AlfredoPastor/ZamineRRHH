package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Contrato;

@Stateless
public class ContratoDaoImpl implements ContratoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Contrato> findAllContrato() {
		return em.createNamedQuery("Contrato.findAll").getResultList();
	}

	//@Override
	public Contrato findContratoById(Contrato contrato) {
		return em.find(Contrato.class, contrato.getIdContrato());
	}

	//@Override
	public void insertContrato(Contrato contrato) {
		em.persist(contrato);
	}

	//@Override
	public void updateContrato(Contrato contrato) {
		em.merge( contrato );
	}

	//@Override
	public void deleteContrato(Contrato contrato) {
		em.merge(contrato);
		em.remove( contrato );
	}

}