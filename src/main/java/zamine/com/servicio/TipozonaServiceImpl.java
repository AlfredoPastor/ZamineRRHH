package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Tipozona;
import zamine.com.eis.TipozonaDao;

@Stateless
public class TipozonaServiceImpl implements TipozonaService {
	
	@EJB
	private TipozonaDao tipozonaDao;

	public List<Tipozona> listarTipozona() {
		return tipozonaDao.findAllTipozona();
	}

	public Tipozona encontrarTipozonaPorId(Tipozona tipozona) {
		return tipozonaDao.findTipozonaById(tipozona);
	}

	public void registrarTipozona(Tipozona tipozona) {
		tipozonaDao.insertTipozona(tipozona);
	}

	public void modificarTipozona(Tipozona tipozona) {
		tipozonaDao.updateTipozona(tipozona);
	}

	public void eliminarTipozona(Tipozona tipozona) {
		tipozonaDao.deleteTipozona(tipozona);
	}

}