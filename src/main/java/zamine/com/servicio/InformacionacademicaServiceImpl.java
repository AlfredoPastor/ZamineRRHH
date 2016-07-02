package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Informacionacademica;
import zamine.com.eis.InformacionacademicaDao;

@Stateless
public class InformacionacademicaServiceImpl implements InformacionacademicaService {
	
	@EJB
	private InformacionacademicaDao informacionacademicaDao;

	public List<Informacionacademica> listarInformacionacademica() {
		return informacionacademicaDao.findAllInformacionacademica();
	}

	public Informacionacademica encontrarInformacionacademicaPorId(Informacionacademica informacionacademica) {
		return informacionacademicaDao.findInformacionacademicaById(informacionacademica);
	}

	public void registrarInformacionacademica(Informacionacademica informacionacademica) {
		informacionacademicaDao.insertInformacionacademica(informacionacademica);
	}

	public void modificarInformacionacademica(Informacionacademica informacionacademica) {
		informacionacademicaDao.updateInformacionacademica(informacionacademica);
	}

	public void eliminarInformacionacademica(Informacionacademica informacionacademica) {
		informacionacademicaDao.deleteInformacionacademica(informacionacademica);
	}

}