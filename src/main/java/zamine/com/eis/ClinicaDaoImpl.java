package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Clinica;

@Stateless
public class ClinicaDaoImpl implements ClinicaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Clinica> findAllClinica() {
		return em.createNamedQuery("Clinica.findAll").getResultList();
	}

	//@Override
	public Clinica findClinicaById(Clinica clinica) {
		return em.find(Clinica.class, clinica.getIdClinica());
	}

	//@Override
	public void insertClinica(Clinica clinica) {
		em.persist(clinica);
	}

	//@Override
	public void updateClinica(Clinica clinica) {
		em.merge( clinica );
	}

	//@Override
	public void deleteClinica(Clinica clinica) {
		em.merge(clinica);
		em.remove( clinica );
	}

}