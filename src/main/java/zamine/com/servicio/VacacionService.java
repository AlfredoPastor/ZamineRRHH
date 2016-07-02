package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Vacacion;

@Local
public interface VacacionService {

	public List<Vacacion> listarVacacion();
	
	public Vacacion encontrarVacacionPorId(Vacacion vacacion);

	public void registrarVacacion(Vacacion vacacion);

	public void modificarVacacion(Vacacion vacacion);

	public void eliminarVacacion(Vacacion vacacion);
}