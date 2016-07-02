package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Entidadprestadoraservicio;
import zamine.com.eis.EntidadprestadoraservicioDao;

@Stateless
public class EntidadprestadoraservicioServiceImpl implements EntidadprestadoraservicioService {
	
	@EJB
	private EntidadprestadoraservicioDao entidadprestadoraservicioDao;

	public List<Entidadprestadoraservicio> listarEntidadprestadoraservicio() {
		return entidadprestadoraservicioDao.findAllEntidadprestadoraservicio();
	}

	public Entidadprestadoraservicio encontrarEntidadprestadoraservicioPorId(Entidadprestadoraservicio entidadprestadoraservicio) {
		return entidadprestadoraservicioDao.findEntidadprestadoraservicioById(entidadprestadoraservicio);
	}

	public void registrarEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio) {
		entidadprestadoraservicioDao.insertEntidadprestadoraservicio(entidadprestadoraservicio);
	}

	public void modificarEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio) {
		entidadprestadoraservicioDao.updateEntidadprestadoraservicio(entidadprestadoraservicio);
	}

	public void eliminarEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio) {
		entidadprestadoraservicioDao.deleteEntidadprestadoraservicio(entidadprestadoraservicio);
	}

}