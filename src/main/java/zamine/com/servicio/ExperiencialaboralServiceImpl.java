package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Experiencialaboral;
import zamine.com.eis.ExperiencialaboralDao;

@Stateless
public class ExperiencialaboralServiceImpl implements ExperiencialaboralService {
	
	@EJB
	private ExperiencialaboralDao experiencialaboralDao;

	public List<Experiencialaboral> listarExperiencialaboral() {
		return experiencialaboralDao.findAllExperiencialaboral();
	}

	public Experiencialaboral encontrarExperiencialaboralPorId(Experiencialaboral experiencialaboral) {
		return experiencialaboralDao.findExperiencialaboralById(experiencialaboral);
	}

	public void registrarExperiencialaboral(Experiencialaboral experiencialaboral) {
		experiencialaboralDao.insertExperiencialaboral(experiencialaboral);
	}

	public void modificarExperiencialaboral(Experiencialaboral experiencialaboral) {
		experiencialaboralDao.updateExperiencialaboral(experiencialaboral);
	}

	public void eliminarExperiencialaboral(Experiencialaboral experiencialaboral) {
		experiencialaboralDao.deleteExperiencialaboral(experiencialaboral);
	}

}