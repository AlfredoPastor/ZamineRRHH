package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Informacionacademica;

@Local
public interface InformacionacademicaService {

	public List<Informacionacademica> listarInformacionacademica();
	
	public Informacionacademica encontrarInformacionacademicaPorId(Informacionacademica informacionacademica);

	public void registrarInformacionacademica(Informacionacademica informacionacademica);

	public void modificarInformacionacademica(Informacionacademica informacionacademica);

	public void eliminarInformacionacademica(Informacionacademica informacionacademica);
}