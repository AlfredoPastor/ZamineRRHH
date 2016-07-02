package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Regimenlaboral;
import zamine.com.eis.RegimenlaboralDao;

@Stateless
public class RegimenlaboralServiceImpl implements RegimenlaboralService {
	
	@EJB
	private RegimenlaboralDao regimenlaboralDao;

	public List<Regimenlaboral> listarRegimenlaboral() {
		return regimenlaboralDao.findAllRegimenlaboral();
	}

	public Regimenlaboral encontrarRegimenlaboralPorId(Regimenlaboral regimenlaboral) {
		return regimenlaboralDao.findRegimenlaboralById(regimenlaboral);
	}

	public void registrarRegimenlaboral(Regimenlaboral regimenlaboral) {
		regimenlaboralDao.insertRegimenlaboral(regimenlaboral);
	}

	public void modificarRegimenlaboral(Regimenlaboral regimenlaboral) {
		regimenlaboralDao.updateRegimenlaboral(regimenlaboral);
	}

	public void eliminarRegimenlaboral(Regimenlaboral regimenlaboral) {
		regimenlaboralDao.deleteRegimenlaboral(regimenlaboral);
	}

}