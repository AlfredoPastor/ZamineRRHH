package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Sistemapension;
import zamine.com.eis.SistemapensionDao;

@Stateless
public class SistemapensionServiceImpl implements SistemapensionService {
	
	@EJB
	private SistemapensionDao sistemapensionDao;

	public List<Sistemapension> listarSistemapension() {
		return sistemapensionDao.findAllSistemapension();
	}

	public Sistemapension encontrarSistemapensionPorId(Sistemapension sistemapension) {
		return sistemapensionDao.findSistemapensionById(sistemapension);
	}

	public void registrarSistemapension(Sistemapension sistemapension) {
		sistemapensionDao.insertSistemapension(sistemapension);
	}

	public void modificarSistemapension(Sistemapension sistemapension) {
		sistemapensionDao.updateSistemapension(sistemapension);
	}

	public void eliminarSistemapension(Sistemapension sistemapension) {
		sistemapensionDao.deleteSistemapension(sistemapension);
	}

}