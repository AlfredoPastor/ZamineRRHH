package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Departamento;

@Local
public interface DepartamentoService {

	public List<Departamento> listarDepartamento();
	
	public Departamento encontrarDepartamentoPorId(Departamento departamento);

	public void registrarDepartamento(Departamento departamento);

	public void modificarDepartamento(Departamento departamento);

	public void eliminarDepartamento(Departamento departamento);
}