package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Asistencia;
import zamine.com.eis.AsistenciaDao;

@Stateless
public class AsistenciaServiceImpl implements AsistenciaService {
	
	@EJB
	private AsistenciaDao asistenciaDao;

	public List<Asistencia> listarAsistencia() {
		return asistenciaDao.findAllAsistencia();
	}

	public Asistencia encontrarAsistenciaPorId(Asistencia asistencia) {
		return asistenciaDao.findAsistenciaById(asistencia);
	}

	public void registrarAsistencia(Asistencia asistencia) {
		asistenciaDao.insertAsistencia(asistencia);
	}

	public void modificarAsistencia(Asistencia asistencia) {
		asistenciaDao.updateAsistencia(asistencia);
	}

	public void eliminarAsistencia(Asistencia asistencia) {
		asistenciaDao.deleteAsistencia(asistencia);
	}

}