package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Categoriadiagnostico;
import zamine.com.eis.CategoriadiagnosticoDao;

@Stateless
public class CategoriadiagnosticoServiceImpl implements CategoriadiagnosticoService {
	
	@EJB
	private CategoriadiagnosticoDao categoriadiagnosticoDao;

	public List<Categoriadiagnostico> listarCategoriadiagnostico() {
		return categoriadiagnosticoDao.findAllCategoriadiagnostico();
	}

	public Categoriadiagnostico encontrarCategoriadiagnosticoPorId(Categoriadiagnostico categoriadiagnostico) {
		return categoriadiagnosticoDao.findCategoriadiagnosticoById(categoriadiagnostico);
	}

	public void registrarCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico) {
		categoriadiagnosticoDao.insertCategoriadiagnostico(categoriadiagnostico);
	}

	public void modificarCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico) {
		categoriadiagnosticoDao.updateCategoriadiagnostico(categoriadiagnostico);
	}

	public void eliminarCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico) {
		categoriadiagnosticoDao.deleteCategoriadiagnostico(categoriadiagnostico);
	}

}