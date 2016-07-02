package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Descansomedico;
import zamine.com.eis.DescansomedicoDao;

@Stateless
public class DescansomedicoServiceImpl implements DescansomedicoService {
	
	@EJB
	private DescansomedicoDao descansomedicoDao;

	public List<Descansomedico> listarDescansomedico() {
		return descansomedicoDao.findAllDescansomedico();
	}

	public Descansomedico encontrarDescansomedicoPorId(Descansomedico descansomedico) {
		return descansomedicoDao.findDescansomedicoById(descansomedico);
	}

	public void registrarDescansomedico(Descansomedico descansomedico) {
		descansomedicoDao.insertDescansomedico(descansomedico);
	}

	public void modificarDescansomedico(Descansomedico descansomedico) {
		descansomedicoDao.updateDescansomedico(descansomedico);
	}

	public void eliminarDescansomedico(Descansomedico descansomedico) {
		descansomedicoDao.deleteDescansomedico(descansomedico);
	}

}