package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Capacitacion;

@Local
public interface CapacitacionService {

	public List<Capacitacion> listarCapacitacion();
	
	public Capacitacion encontrarCapacitacionPorId(Capacitacion capacitacion);

	public void registrarCapacitacion(Capacitacion capacitacion);

	public void modificarCapacitacion(Capacitacion capacitacion);

	public void eliminarCapacitacion(Capacitacion capacitacion);
}