package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Informacionacademica;

@Stateless
public class InformacionacademicaDaoImpl implements InformacionacademicaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Informacionacademica> findAllInformacionacademica() {
		return em.createNamedQuery("Informacionacademica.findAll").getResultList();
	}

	//@Override
	public Informacionacademica findInformacionacademicaById(Informacionacademica informacionacademica) {
		return em.find(Informacionacademica.class, informacionacademica.getIdInformacionAcademica());
	}

	//@Override
	public void insertInformacionacademica(Informacionacademica informacionacademica) {
		em.persist(informacionacademica);
	}

	//@Override
	public void updateInformacionacademica(Informacionacademica informacionacademica) {
		em.merge( informacionacademica );
	}

	//@Override
	public void deleteInformacionacademica(Informacionacademica informacionacademica) {
		em.merge(informacionacademica);
		em.remove( informacionacademica );
	}

}