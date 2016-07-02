package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Niveljerarquico;

@Local
public interface NiveljerarquicoService {

	public List<Niveljerarquico> listarNiveljerarquico();
	
	public Niveljerarquico encontrarNiveljerarquicoPorId(Niveljerarquico niveljerarquico);

	public void registrarNiveljerarquico(Niveljerarquico niveljerarquico);

	public void modificarNiveljerarquico(Niveljerarquico niveljerarquico);

	public void eliminarNiveljerarquico(Niveljerarquico niveljerarquico);
}