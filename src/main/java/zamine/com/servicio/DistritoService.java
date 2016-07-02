package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Distrito;

@Local
public interface DistritoService {

	public List<Distrito> listarDistrito();
	
	public Distrito encontrarDistritoPorId(Distrito distrito);

	public void registrarDistrito(Distrito distrito);

	public void modificarDistrito(Distrito distrito);

	public void eliminarDistrito(Distrito distrito);
}