package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Departamento;
import zamine.com.eis.DepartamentoDao;

@Stateless
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@EJB
	private DepartamentoDao departamentoDao;

	public List<Departamento> listarDepartamento() {
		return departamentoDao.findAllDepartamento();
	}

	public Departamento encontrarDepartamentoPorId(Departamento departamento) {
		return departamentoDao.findDepartamentoById(departamento);
	}

	public void registrarDepartamento(Departamento departamento) {
		departamentoDao.insertDepartamento(departamento);
	}

	public void modificarDepartamento(Departamento departamento) {
		departamentoDao.updateDepartamento(departamento);
	}

	public void eliminarDepartamento(Departamento departamento) {
		departamentoDao.deleteDepartamento(departamento);
	}

}