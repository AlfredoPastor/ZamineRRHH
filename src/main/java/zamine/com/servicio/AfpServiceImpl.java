package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Afp;
import zamine.com.eis.AfpDao;

@Stateless
public class AfpServiceImpl implements AfpService {
	
	@EJB
	private AfpDao afpDao;

	public List<Afp> listarAfp() {
		return afpDao.findAllAfp();
	}

	public Afp encontrarAfpPorId(Afp afp) {
		return afpDao.findAfpById(afp);
	}

	public void registrarAfp(Afp afp) {
		afpDao.insertAfp(afp);
	}

	public void modificarAfp(Afp afp) {
		afpDao.updateAfp(afp);
	}

	public void eliminarAfp(Afp afp) {
		afpDao.deleteAfp(afp);
	}

}