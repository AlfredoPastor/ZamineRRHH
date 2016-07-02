package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Regimenpensionario;

@Local
public interface RegimenpensionarioService {

	public List<Regimenpensionario> listarRegimenpensionario();
	
	public Regimenpensionario encontrarRegimenpensionarioPorId(Regimenpensionario regimenpensionario);

	public void registrarRegimenpensionario(Regimenpensionario regimenpensionario);

	public void modificarRegimenpensionario(Regimenpensionario regimenpensionario);

	public void eliminarRegimenpensionario(Regimenpensionario regimenpensionario);
}