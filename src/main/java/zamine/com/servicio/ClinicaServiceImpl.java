package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Clinica;
import zamine.com.eis.ClinicaDao;

@Stateless
public class ClinicaServiceImpl implements ClinicaService {
	
	@EJB
	private ClinicaDao clinicaDao;

	public List<Clinica> listarClinica() {
		return clinicaDao.findAllClinica();
	}

	public Clinica encontrarClinicaPorId(Clinica clinica) {
		return clinicaDao.findClinicaById(clinica);
	}

	public void registrarClinica(Clinica clinica) {
		clinicaDao.insertClinica(clinica);
	}

	public void modificarClinica(Clinica clinica) {
		clinicaDao.updateClinica(clinica);
	}

	public void eliminarClinica(Clinica clinica) {
		clinicaDao.deleteClinica(clinica);
	}

}