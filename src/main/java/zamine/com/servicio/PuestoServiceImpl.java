package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Puesto;
import zamine.com.eis.PuestoDao;

@Stateless
public class PuestoServiceImpl implements PuestoService {
	
	@EJB
	private PuestoDao puestoDao;

	public List<Puesto> listarPuesto() {
		return puestoDao.findAllPuesto();
	}

	public Puesto encontrarPuestoPorId(Puesto puesto) {
		return puestoDao.findPuestoById(puesto);
	}

	public void registrarPuesto(Puesto puesto) {
		puestoDao.insertPuesto(puesto);
	}

	public void modificarPuesto(Puesto puesto) {
		puestoDao.updatePuesto(puesto);
	}

	public void eliminarPuesto(Puesto puesto) {
		puestoDao.deletePuesto(puesto);
	}

}