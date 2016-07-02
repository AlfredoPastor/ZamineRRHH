package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the documentoidentidad database table.
 * 
 */
@Entity
@NamedQuery(name="Documentoidentidad.findAll", query="SELECT d FROM Documentoidentidad d")
public class Documentoidentidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoDocumentoIdentidad;

	private String documentoIdentidad;

	//bi-directional many-to-one association to Trabajador
	@OneToMany(mappedBy="documentoidentidad")
	private List<Trabajador> trabajadors;

	public Documentoidentidad() {
	}

	public int getIdTipoDocumentoIdentidad() {
		return this.idTipoDocumentoIdentidad;
	}

	public void setIdTipoDocumentoIdentidad(int idTipoDocumentoIdentidad) {
		this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
	}

	public String getDocumentoIdentidad() {
		return this.documentoIdentidad;
	}

	public void setDocumentoIdentidad(String documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}

	public List<Trabajador> getTrabajadors() {
		return this.trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}

	public Trabajador addTrabajador(Trabajador trabajador) {
		getTrabajadors().add(trabajador);
		trabajador.setDocumentoidentidad(this);

		return trabajador;
	}

	public Trabajador removeTrabajador(Trabajador trabajador) {
		getTrabajadors().remove(trabajador);
		trabajador.setDocumentoidentidad(null);

		return trabajador;
	}

}