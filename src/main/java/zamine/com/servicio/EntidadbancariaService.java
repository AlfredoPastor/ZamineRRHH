package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Entidadbancaria;

@Local
public interface EntidadbancariaService {

	public List<Entidadbancaria> listarEntidadbancaria();
	
	public Entidadbancaria encontrarEntidadbancariaPorId(Entidadbancaria entidadbancaria);

	public void registrarEntidadbancaria(Entidadbancaria entidadbancaria);

	public void modificarEntidadbancaria(Entidadbancaria entidadbancaria);

	public void eliminarEntidadbancaria(Entidadbancaria entidadbancaria);
}