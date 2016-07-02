package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Entidadprestadoraservicio;

@Local
public interface EntidadprestadoraservicioService {

	public List<Entidadprestadoraservicio> listarEntidadprestadoraservicio();
	
	public Entidadprestadoraservicio encontrarEntidadprestadoraservicioPorId(Entidadprestadoraservicio entidadprestadoraservicio);

	public void registrarEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio);

	public void modificarEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio);

	public void eliminarEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio);
}