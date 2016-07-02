package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Autorizacion;
import zamine.com.eis.AutorizacionDao;

@Stateless
public class AutorizacionServiceImpl implements AutorizacionService {
	
	@EJB
	private AutorizacionDao autorizacionDao;

	public List<Autorizacion> listarAutorizacion() {
		return autorizacionDao.findAllAutorizacion();
	}

	public Autorizacion encontrarAutorizacionPorId(Autorizacion autorizacion) {
		return autorizacionDao.findAutorizacionById(autorizacion);
	}

	public void registrarAutorizacion(Autorizacion autorizacion) {
		autorizacionDao.insertAutorizacion(autorizacion);
	}

	public void modificarAutorizacion(Autorizacion autorizacion) {
		autorizacionDao.updateAutorizacion(autorizacion);
	}

	public void eliminarAutorizacion(Autorizacion autorizacion) {
		autorizacionDao.deleteAutorizacion(autorizacion);
	}

}