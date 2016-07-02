package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Distrito;
import zamine.com.eis.DistritoDao;

@Stateless
public class DistritoServiceImpl implements DistritoService {
	
	@EJB
	private DistritoDao distritoDao;

	public List<Distrito> listarDistrito() {
		return distritoDao.findAllDistrito();
	}

	public Distrito encontrarDistritoPorId(Distrito distrito) {
		return distritoDao.findDistritoById(distrito);
	}

	public void registrarDistrito(Distrito distrito) {
		distritoDao.insertDistrito(distrito);
	}

	public void modificarDistrito(Distrito distrito) {
		distritoDao.updateDistrito(distrito);
	}

	public void eliminarDistrito(Distrito distrito) {
		distritoDao.deleteDistrito(distrito);
	}

}