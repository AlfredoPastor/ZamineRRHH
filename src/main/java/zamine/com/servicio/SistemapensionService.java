package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Sistemapension;

@Local
public interface SistemapensionService {

	public List<Sistemapension> listarSistemapension();
	
	public Sistemapension encontrarSistemapensionPorId(Sistemapension sistemapension);

	public void registrarSistemapension(Sistemapension sistemapension);

	public void modificarSistemapension(Sistemapension sistemapension);

	public void eliminarSistemapension(Sistemapension sistemapension);
}