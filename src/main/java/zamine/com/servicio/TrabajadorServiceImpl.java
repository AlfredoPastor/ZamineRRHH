package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Trabajador;
import zamine.com.eis.TrabajadorDao;

@Stateless
public class TrabajadorServiceImpl implements TrabajadorService {
	
	@EJB
	private TrabajadorDao trabajadorDao;

	public List<Trabajador> listarTrabajador() {
		return trabajadorDao.findAllTrabajador();
	}

	public Trabajador encontrarTrabajadorPorId(Trabajador trabajador) {
		return trabajadorDao.findTrabajadorById(trabajador);
	}

	public void registrarTrabajador(Trabajador trabajador) {
		trabajadorDao.insertTrabajador(trabajador);
	}

	public void modificarTrabajador(Trabajador trabajador) {
		trabajadorDao.updateTrabajador(trabajador);
	}

	public void eliminarTrabajador(Trabajador trabajador) {
		trabajadorDao.deleteTrabajador(trabajador);
	}

}