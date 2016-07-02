package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Categoriadiagnostico;

@Local
public interface CategoriadiagnosticoService {

	public List<Categoriadiagnostico> listarCategoriadiagnostico();
	
	public Categoriadiagnostico encontrarCategoriadiagnosticoPorId(Categoriadiagnostico categoriadiagnostico);

	public void registrarCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico);

	public void modificarCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico);

	public void eliminarCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico);
}