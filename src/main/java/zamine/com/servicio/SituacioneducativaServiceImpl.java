package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Situacioneducativa;
import zamine.com.eis.SituacioneducativaDao;

@Stateless
public class SituacioneducativaServiceImpl implements SituacioneducativaService {
	
	@EJB
	private SituacioneducativaDao situacioneducativaDao;

	public List<Situacioneducativa> listarSituacioneducativa() {
		return situacioneducativaDao.findAllSituacioneducativa();
	}

	public Situacioneducativa encontrarSituacioneducativaPorId(Situacioneducativa situacioneducativa) {
		return situacioneducativaDao.findSituacioneducativaById(situacioneducativa);
	}

	public void registrarSituacioneducativa(Situacioneducativa situacioneducativa) {
		situacioneducativaDao.insertSituacioneducativa(situacioneducativa);
	}

	public void modificarSituacioneducativa(Situacioneducativa situacioneducativa) {
		situacioneducativaDao.updateSituacioneducativa(situacioneducativa);
	}

	public void eliminarSituacioneducativa(Situacioneducativa situacioneducativa) {
		situacioneducativaDao.deleteSituacioneducativa(situacioneducativa);
	}

}