package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Provincia;

@Local
public interface ProvinciaService {

	public List<Provincia> listarProvincia();
	
	public Provincia encontrarProvinciaPorId(Provincia provincia);

	public void registrarProvincia(Provincia provincia);

	public void modificarProvincia(Provincia provincia);

	public void eliminarProvincia(Provincia provincia);
}