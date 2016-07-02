package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Tipoatencion;
import zamine.com.eis.TipoatencionDao;

@Stateless
public class TipoatencionServiceImpl implements TipoatencionService {
	
	@EJB
	private TipoatencionDao tipoatencionDao;

	public List<Tipoatencion> listarTipoatencion() {
		return tipoatencionDao.findAllTipoatencion();
	}

	public Tipoatencion encontrarTipoatencionPorId(Tipoatencion tipoatencion) {
		return tipoatencionDao.findTipoatencionById(tipoatencion);
	}

	public void registrarTipoatencion(Tipoatencion tipoatencion) {
		tipoatencionDao.insertTipoatencion(tipoatencion);
	}

	public void modificarTipoatencion(Tipoatencion tipoatencion) {
		tipoatencionDao.updateTipoatencion(tipoatencion);
	}

	public void eliminarTipoatencion(Tipoatencion tipoatencion) {
		tipoatencionDao.deleteTipoatencion(tipoatencion);
	}

}