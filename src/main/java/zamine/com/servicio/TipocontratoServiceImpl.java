package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Tipocontrato;
import zamine.com.eis.TipocontratoDao;

@Stateless
public class TipocontratoServiceImpl implements TipocontratoService {
	
	@EJB
	private TipocontratoDao tipocontratoDao;

	public List<Tipocontrato> listarTipocontrato() {
		return tipocontratoDao.findAllTipocontrato();
	}

	public Tipocontrato encontrarTipocontratoPorId(Tipocontrato tipocontrato) {
		return tipocontratoDao.findTipocontratoById(tipocontrato);
	}

	public void registrarTipocontrato(Tipocontrato tipocontrato) {
		tipocontratoDao.insertTipocontrato(tipocontrato);
	}

	public void modificarTipocontrato(Tipocontrato tipocontrato) {
		tipocontratoDao.updateTipocontrato(tipocontrato);
	}

	public void eliminarTipocontrato(Tipocontrato tipocontrato) {
		tipocontratoDao.deleteTipocontrato(tipocontrato);
	}

}