package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Tipovia;
import zamine.com.eis.TipoviaDao;

@Stateless
public class TipoviaServiceImpl implements TipoviaService {
	
	@EJB
	private TipoviaDao tipoviaDao;

	public List<Tipovia> listarTipovia() {
		return tipoviaDao.findAllTipovia();
	}

	public Tipovia encontrarTipoviaPorId(Tipovia tipovia) {
		return tipoviaDao.findTipoviaById(tipovia);
	}

	public void registrarTipovia(Tipovia tipovia) {
		tipoviaDao.insertTipovia(tipovia);
	}

	public void modificarTipovia(Tipovia tipovia) {
		tipoviaDao.updateTipovia(tipovia);
	}

	public void eliminarTipovia(Tipovia tipovia) {
		tipoviaDao.deleteTipovia(tipovia);
	}

}