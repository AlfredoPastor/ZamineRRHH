package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Capacitacion;
import zamine.com.eis.CapacitacionDao;

@Stateless
public class CapacitacionServiceImpl implements CapacitacionService {
	
	@EJB
	private CapacitacionDao capacitacionDao;

	public List<Capacitacion> listarCapacitacion() {
		return capacitacionDao.findAllCapacitacion();
	}

	public Capacitacion encontrarCapacitacionPorId(Capacitacion capacitacion) {
		return capacitacionDao.findCapacitacionById(capacitacion);
	}

	public void registrarCapacitacion(Capacitacion capacitacion) {
		capacitacionDao.insertCapacitacion(capacitacion);
	}

	public void modificarCapacitacion(Capacitacion capacitacion) {
		capacitacionDao.updateCapacitacion(capacitacion);
	}

	public void eliminarCapacitacion(Capacitacion capacitacion) {
		capacitacionDao.deleteCapacitacion(capacitacion);
	}

}