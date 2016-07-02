package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Experiencialaboral;

@Local
public interface ExperiencialaboralService {

	public List<Experiencialaboral> listarExperiencialaboral();
	
	public Experiencialaboral encontrarExperiencialaboralPorId(Experiencialaboral experiencialaboral);

	public void registrarExperiencialaboral(Experiencialaboral experiencialaboral);

	public void modificarExperiencialaboral(Experiencialaboral experiencialaboral);

	public void eliminarExperiencialaboral(Experiencialaboral experiencialaboral);
}