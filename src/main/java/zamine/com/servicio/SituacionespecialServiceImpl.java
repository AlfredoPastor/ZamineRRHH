package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Situacionespecial;
import zamine.com.eis.SituacionespecialDao;

@Stateless
public class SituacionespecialServiceImpl implements SituacionespecialService {
	
	@EJB
	private SituacionespecialDao situacionespecialDao;

	public List<Situacionespecial> listarSituacionespecial() {
		return situacionespecialDao.findAllSituacionespecial();
	}

	public Situacionespecial encontrarSituacionespecialPorId(Situacionespecial situacionespecial) {
		return situacionespecialDao.findSituacionespecialById(situacionespecial);
	}

	public void registrarSituacionespecial(Situacionespecial situacionespecial) {
		situacionespecialDao.insertSituacionespecial(situacionespecial);
	}

	public void modificarSituacionespecial(Situacionespecial situacionespecial) {
		situacionespecialDao.updateSituacionespecial(situacionespecial);
	}

	public void eliminarSituacionespecial(Situacionespecial situacionespecial) {
		situacionespecialDao.deleteSituacionespecial(situacionespecial);
	}

}