package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Niveljerarquico;
import zamine.com.eis.NiveljerarquicoDao;

@Stateless
public class NiveljerarquicoServiceImpl implements NiveljerarquicoService {
	
	@EJB
	private NiveljerarquicoDao niveljerarquicoDao;

	public List<Niveljerarquico> listarNiveljerarquico() {
		return niveljerarquicoDao.findAllNiveljerarquico();
	}

	public Niveljerarquico encontrarNiveljerarquicoPorId(Niveljerarquico niveljerarquico) {
		return niveljerarquicoDao.findNiveljerarquicoById(niveljerarquico);
	}

	public void registrarNiveljerarquico(Niveljerarquico niveljerarquico) {
		niveljerarquicoDao.insertNiveljerarquico(niveljerarquico);
	}

	public void modificarNiveljerarquico(Niveljerarquico niveljerarquico) {
		niveljerarquicoDao.updateNiveljerarquico(niveljerarquico);
	}

	public void eliminarNiveljerarquico(Niveljerarquico niveljerarquico) {
		niveljerarquicoDao.deleteNiveljerarquico(niveljerarquico);
	}

}