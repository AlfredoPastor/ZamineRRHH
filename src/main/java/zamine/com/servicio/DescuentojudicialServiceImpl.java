package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Descuentojudicial;
import zamine.com.eis.DescuentojudicialDao;

@Stateless
public class DescuentojudicialServiceImpl implements DescuentojudicialService {
	
	@EJB
	private DescuentojudicialDao descuentojudicialDao;

	public List<Descuentojudicial> listarDescuentojudicial() {
		return descuentojudicialDao.findAllDescuentojudicial();
	}

	public Descuentojudicial encontrarDescuentojudicialPorId(Descuentojudicial descuentojudicial) {
		return descuentojudicialDao.findDescuentojudicialById(descuentojudicial);
	}

	public void registrarDescuentojudicial(Descuentojudicial descuentojudicial) {
		descuentojudicialDao.insertDescuentojudicial(descuentojudicial);
	}

	public void modificarDescuentojudicial(Descuentojudicial descuentojudicial) {
		descuentojudicialDao.updateDescuentojudicial(descuentojudicial);
	}

	public void eliminarDescuentojudicial(Descuentojudicial descuentojudicial) {
		descuentojudicialDao.deleteDescuentojudicial(descuentojudicial);
	}

}