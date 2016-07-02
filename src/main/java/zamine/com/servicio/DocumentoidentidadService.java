package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Documentoidentidad;

@Local
public interface DocumentoidentidadService {

	public List<Documentoidentidad> listarDocumentoidentidad();
	
	public Documentoidentidad encontrarDocumentoidentidadPorId(Documentoidentidad documentoidentidad);

	public void registrarDocumentoidentidad(Documentoidentidad documentoidentidad);

	public void modificarDocumentoidentidad(Documentoidentidad documentoidentidad);

	public void eliminarDocumentoidentidad(Documentoidentidad documentoidentidad);
}