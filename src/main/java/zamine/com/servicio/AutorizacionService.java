package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Autorizacion;

@Local
public interface AutorizacionService {

	public List<Autorizacion> listarAutorizacion();
	
	public Autorizacion encontrarAutorizacionPorId(Autorizacion autorizacion);

	public void registrarAutorizacion(Autorizacion autorizacion);

	public void modificarAutorizacion(Autorizacion autorizacion);

	public void eliminarAutorizacion(Autorizacion autorizacion);
}