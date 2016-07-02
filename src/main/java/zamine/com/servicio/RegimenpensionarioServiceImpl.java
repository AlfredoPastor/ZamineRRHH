package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Regimenpensionario;
import zamine.com.eis.RegimenpensionarioDao;

@Stateless
public class RegimenpensionarioServiceImpl implements RegimenpensionarioService {
	
	@EJB
	private RegimenpensionarioDao regimenpensionarioDao;

	public List<Regimenpensionario> listarRegimenpensionario() {
		return regimenpensionarioDao.findAllRegimenpensionario();
	}

	public Regimenpensionario encontrarRegimenpensionarioPorId(Regimenpensionario regimenpensionario) {
		return regimenpensionarioDao.findRegimenpensionarioById(regimenpensionario);
	}

	public void registrarRegimenpensionario(Regimenpensionario regimenpensionario) {
		regimenpensionarioDao.insertRegimenpensionario(regimenpensionario);
	}

	public void modificarRegimenpensionario(Regimenpensionario regimenpensionario) {
		regimenpensionarioDao.updateRegimenpensionario(regimenpensionario);
	}

	public void eliminarRegimenpensionario(Regimenpensionario regimenpensionario) {
		regimenpensionarioDao.deleteRegimenpensionario(regimenpensionario);
	}

}