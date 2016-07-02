package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Departamento;

public interface DepartamentoDao {

	public List<Departamento> findAllDepartamento();

	public Departamento findDepartamentoById(Departamento departamento);

	public void insertDepartamento(Departamento departamento);

	public void updateDepartamento(Departamento departamento);

	public void deleteDepartamento(Departamento departamento);
}