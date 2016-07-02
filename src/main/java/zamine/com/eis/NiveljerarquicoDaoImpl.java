package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Niveljerarquico;

@Stateless
public class NiveljerarquicoDaoImpl implements NiveljerarquicoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Niveljerarquico> findAllNiveljerarquico() {
		return em.createNamedQuery("Niveljerarquico.findAll").getResultList();
	}

	//@Override
	public Niveljerarquico findNiveljerarquicoById(Niveljerarquico niveljerarquico) {
		return em.find(Niveljerarquico.class, niveljerarquico.getIdNivelJerarquico());
	}

	//@Override
	public void insertNiveljerarquico(Niveljerarquico niveljerarquico) {
		em.persist(niveljerarquico);
	}

	//@Override
	public void updateNiveljerarquico(Niveljerarquico niveljerarquico) {
		em.merge( niveljerarquico );
	}

	//@Override
	public void deleteNiveljerarquico(Niveljerarquico niveljerarquico) {
		em.merge(niveljerarquico);
		em.remove( niveljerarquico );
	}

}