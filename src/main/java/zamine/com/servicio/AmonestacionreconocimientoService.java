package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Amonestacionreconocimiento;

@Local
public interface AmonestacionreconocimientoService {

	public List<Amonestacionreconocimiento> listarAmonestacionreconocimiento();
	
	public Amonestacionreconocimiento encontrarAmonestacionreconocimientoPorId(Amonestacionreconocimiento amonestacionreconocimiento);

	public void registrarAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento);

	public void modificarAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento);

	public void eliminarAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento);
}