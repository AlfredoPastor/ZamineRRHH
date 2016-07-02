package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Entidadbancaria;
import zamine.com.eis.EntidadbancariaDao;

@Stateless
public class EntidadbancariaServiceImpl implements EntidadbancariaService {
	
	@EJB
	private EntidadbancariaDao entidadbancariaDao;

	public List<Entidadbancaria> listarEntidadbancaria() {
		return entidadbancariaDao.findAllEntidadbancaria();
	}

	public Entidadbancaria encontrarEntidadbancariaPorId(Entidadbancaria entidadbancaria) {
		return entidadbancariaDao.findEntidadbancariaById(entidadbancaria);
	}

	public void registrarEntidadbancaria(Entidadbancaria entidadbancaria) {
		entidadbancariaDao.insertEntidadbancaria(entidadbancaria);
	}

	public void modificarEntidadbancaria(Entidadbancaria entidadbancaria) {
		entidadbancariaDao.updateEntidadbancaria(entidadbancaria);
	}

	public void eliminarEntidadbancaria(Entidadbancaria entidadbancaria) {
		entidadbancariaDao.deleteEntidadbancaria(entidadbancaria);
	}

}