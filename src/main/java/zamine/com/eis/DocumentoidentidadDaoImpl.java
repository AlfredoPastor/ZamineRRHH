package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Documentoidentidad;

@Stateless
public class DocumentoidentidadDaoImpl implements DocumentoidentidadDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Documentoidentidad> findAllDocumentoidentidad() {
		return em.createNamedQuery("Documentoidentidad.findAll").getResultList();
	}

	//@Override
	public Documentoidentidad findDocumentoidentidadById(Documentoidentidad documentoidentidad) {
		return em.find(Documentoidentidad.class, documentoidentidad.getIdTipoDocumentoIdentidad());
	}

	//@Override
	public void insertDocumentoidentidad(Documentoidentidad documentoidentidad) {
		em.persist(documentoidentidad);
	}

	//@Override
	public void updateDocumentoidentidad(Documentoidentidad documentoidentidad) {
		em.merge( documentoidentidad );
	}

	//@Override
	public void deleteDocumentoidentidad(Documentoidentidad documentoidentidad) {
		em.merge(documentoidentidad);
		em.remove( documentoidentidad );
	}

}