package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Clinica;

public interface ClinicaDao {

	public List<Clinica> findAllClinica();

	public Clinica findClinicaById(Clinica clinica);

	public void insertClinica(Clinica clinica);

	public void updateClinica(Clinica clinica);

	public void deleteClinica(Clinica clinica);
}