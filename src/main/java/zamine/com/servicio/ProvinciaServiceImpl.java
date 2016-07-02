package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Provincia;
import zamine.com.eis.ProvinciaDao;

@Stateless
public class ProvinciaServiceImpl implements ProvinciaService {
	
	@EJB
	private ProvinciaDao provinciaDao;

	public List<Provincia> listarProvincia() {
		return provinciaDao.findAllProvincia();
	}

	public Provincia encontrarProvinciaPorId(Provincia provincia) {
		return provinciaDao.findProvinciaById(provincia);
	}

	public void registrarProvincia(Provincia provincia) {
		provinciaDao.insertProvincia(provincia);
	}

	public void modificarProvincia(Provincia provincia) {
		provinciaDao.updateProvincia(provincia);
	}

	public void eliminarProvincia(Provincia provincia) {
		provinciaDao.deleteProvincia(provincia);
	}

}