package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Regimenlaboral;

@Local
public interface RegimenlaboralService {

	public List<Regimenlaboral> listarRegimenlaboral();
	
	public Regimenlaboral encontrarRegimenlaboralPorId(Regimenlaboral regimenlaboral);

	public void registrarRegimenlaboral(Regimenlaboral regimenlaboral);

	public void modificarRegimenlaboral(Regimenlaboral regimenlaboral);

	public void eliminarRegimenlaboral(Regimenlaboral regimenlaboral);
}