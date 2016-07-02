package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Puesto;

@Local
public interface PuestoService {

	public List<Puesto> listarPuesto();
	
	public Puesto encontrarPuestoPorId(Puesto puesto);

	public void registrarPuesto(Puesto puesto);

	public void modificarPuesto(Puesto puesto);

	public void eliminarPuesto(Puesto puesto);
}