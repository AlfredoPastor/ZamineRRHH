package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Vacacion;
import zamine.com.eis.VacacionDao;

@Stateless
public class VacacionServiceImpl implements VacacionService {
	
	@EJB
	private VacacionDao vacacionDao;

	public List<Vacacion> listarVacacion() {
		return vacacionDao.findAllVacacion();
	}

	public Vacacion encontrarVacacionPorId(Vacacion vacacion) {
		return vacacionDao.findVacacionById(vacacion);
	}

	public void registrarVacacion(Vacacion vacacion) {
		vacacionDao.insertVacacion(vacacion);
	}

	public void modificarVacacion(Vacacion vacacion) {
		vacacionDao.updateVacacion(vacacion);
	}

	public void eliminarVacacion(Vacacion vacacion) {
		vacacionDao.deleteVacacion(vacacion);
	}

}