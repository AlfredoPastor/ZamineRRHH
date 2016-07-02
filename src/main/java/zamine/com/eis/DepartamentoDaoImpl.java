package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Departamento;

@Stateless
public class DepartamentoDaoImpl implements DepartamentoDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Departamento> findAllDepartamento() {
		return em.createNamedQuery("Departamento.findAll").getResultList();
	}

	//@Override
	public Departamento findDepartamentoById(Departamento departamento) {
		return em.find(Departamento.class, departamento.getIdDepartamento());
	}

	//@Override
	public void insertDepartamento(Departamento departamento) {
		em.persist(departamento);
	}

	//@Override
	public void updateDepartamento(Departamento departamento) {
		em.merge( departamento );
	}

	//@Override
	public void deleteDepartamento(Departamento departamento) {
		em.merge(departamento);
		em.remove( departamento );
	}

}