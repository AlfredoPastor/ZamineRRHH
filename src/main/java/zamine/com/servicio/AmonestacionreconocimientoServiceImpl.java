package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Amonestacionreconocimiento;
import zamine.com.eis.AmonestacionreconocimientoDao;

@Stateless
public class AmonestacionreconocimientoServiceImpl implements AmonestacionreconocimientoService {
	
	@EJB
	private AmonestacionreconocimientoDao amonestacionreconocimientoDao;

	public List<Amonestacionreconocimiento> listarAmonestacionreconocimiento() {
		return amonestacionreconocimientoDao.findAllAmonestacionreconocimiento();
	}

	public Amonestacionreconocimiento encontrarAmonestacionreconocimientoPorId(Amonestacionreconocimiento amonestacionreconocimiento) {
		return amonestacionreconocimientoDao.findAmonestacionreconocimientoById(amonestacionreconocimiento);
	}

	public void registrarAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento) {
		amonestacionreconocimientoDao.insertAmonestacionreconocimiento(amonestacionreconocimiento);
	}

	public void modificarAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento) {
		amonestacionreconocimientoDao.updateAmonestacionreconocimiento(amonestacionreconocimiento);
	}

	public void eliminarAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento) {
		amonestacionreconocimientoDao.deleteAmonestacionreconocimiento(amonestacionreconocimiento);
	}

}