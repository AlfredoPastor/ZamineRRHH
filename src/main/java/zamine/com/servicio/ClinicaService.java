package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Clinica;

@Local
public interface ClinicaService {

	public List<Clinica> listarClinica();
	
	public Clinica encontrarClinicaPorId(Clinica clinica);

	public void registrarClinica(Clinica clinica);

	public void modificarClinica(Clinica clinica);

	public void eliminarClinica(Clinica clinica);
}