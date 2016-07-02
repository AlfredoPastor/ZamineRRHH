package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Afp;

@Local
public interface AfpService {

	public List<Afp> listarAfp();
	
	public Afp encontrarAfpPorId(Afp afp);

	public void registrarAfp(Afp afp);

	public void modificarAfp(Afp afp);

	public void eliminarAfp(Afp afp);
}