package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Categoriadiagnostico;

@Stateless
public class CategoriadiagnosticoDaoImpl implements CategoriadiagnosticoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Categoriadiagnostico> findAllCategoriadiagnostico() {
		return em.createNamedQuery("Categoriadiagnostico.findAll").getResultList();
	}

	//@Override
	public Categoriadiagnostico findCategoriadiagnosticoById(Categoriadiagnostico categoriadiagnostico) {
		return em.find(Categoriadiagnostico.class, categoriadiagnostico.getIdCategoriaDiagnostico());
	}

	//@Override
	public void insertCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico) {
		em.persist(categoriadiagnostico);
	}

	//@Override
	public void updateCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico) {
		em.merge( categoriadiagnostico );
	}

	//@Override
	public void deleteCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico) {
		em.merge(categoriadiagnostico);
		em.remove( categoriadiagnostico );
	}

}