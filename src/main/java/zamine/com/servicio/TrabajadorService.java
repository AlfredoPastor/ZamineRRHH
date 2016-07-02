package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Trabajador;

@Local
public interface TrabajadorService {

	public List<Trabajador> listarTrabajador();
	
	public Trabajador encontrarTrabajadorPorId(Trabajador trabajador);

	public void registrarTrabajador(Trabajador trabajador);

	public void modificarTrabajador(Trabajador trabajador);

	public void eliminarTrabajador(Trabajador trabajador);
}