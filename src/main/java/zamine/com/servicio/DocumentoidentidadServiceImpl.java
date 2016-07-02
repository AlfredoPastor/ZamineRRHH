package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Documentoidentidad;
import zamine.com.eis.DocumentoidentidadDao;

@Stateless
public class DocumentoidentidadServiceImpl implements DocumentoidentidadService {
	
	@EJB
	private DocumentoidentidadDao documentoidentidadDao;

	public List<Documentoidentidad> listarDocumentoidentidad() {
		return documentoidentidadDao.findAllDocumentoidentidad();
	}

	public Documentoidentidad encontrarDocumentoidentidadPorId(Documentoidentidad documentoidentidad) {
		return documentoidentidadDao.findDocumentoidentidadById(documentoidentidad);
	}

	public void registrarDocumentoidentidad(Documentoidentidad documentoidentidad) {
		documentoidentidadDao.insertDocumentoidentidad(documentoidentidad);
	}

	public void modificarDocumentoidentidad(Documentoidentidad documentoidentidad) {
		documentoidentidadDao.updateDocumentoidentidad(documentoidentidad);
	}

	public void eliminarDocumentoidentidad(Documentoidentidad documentoidentidad) {
		documentoidentidadDao.deleteDocumentoidentidad(documentoidentidad);
	}

}