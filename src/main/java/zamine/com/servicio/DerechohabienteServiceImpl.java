package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Derechohabiente;
import zamine.com.eis.DerechohabienteDao;

@Stateless
public class DerechohabienteServiceImpl implements DerechohabienteService {
	
	@EJB
	private DerechohabienteDao derechohabienteDao;

	public List<Derechohabiente> listarDerechohabiente() {
		return derechohabienteDao.findAllDerechohabiente();
	}

	public Derechohabiente encontrarDerechohabientePorId(Derechohabiente derechohabiente) {
		return derechohabienteDao.findDerechohabienteById(derechohabiente);
	}

	public void registrarDerechohabiente(Derechohabiente derechohabiente) {
		derechohabienteDao.insertDerechohabiente(derechohabiente);
	}

	public void modificarDerechohabiente(Derechohabiente derechohabiente) {
		derechohabienteDao.updateDerechohabiente(derechohabiente);
	}

	public void eliminarDerechohabiente(Derechohabiente derechohabiente) {
		derechohabienteDao.deleteDerechohabiente(derechohabiente);
	}

}