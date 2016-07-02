package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Documentoidentidad;

public interface DocumentoidentidadDao {

	public List<Documentoidentidad> findAllDocumentoidentidad();

	public Documentoidentidad findDocumentoidentidadById(Documentoidentidad documentoidentidad);

	public void insertDocumentoidentidad(Documentoidentidad documentoidentidad);

	public void updateDocumentoidentidad(Documentoidentidad documentoidentidad);

	public void deleteDocumentoidentidad(Documentoidentidad documentoidentidad);
}