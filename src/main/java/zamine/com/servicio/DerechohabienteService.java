package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Derechohabiente;

@Local
public interface DerechohabienteService {

	public List<Derechohabiente> listarDerechohabiente();
	
	public Derechohabiente encontrarDerechohabientePorId(Derechohabiente derechohabiente);

	public void registrarDerechohabiente(Derechohabiente derechohabiente);

	public void modificarDerechohabiente(Derechohabiente derechohabiente);

	public void eliminarDerechohabiente(Derechohabiente derechohabiente);
}