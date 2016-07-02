package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipoatencion database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoatencion.findAll", query="SELECT t FROM Tipoatencion t")
public class Tipoatencion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoAtencion;

	private String tipoAtencion;

	public Tipoatencion() {
	}

	public int getIdTipoAtencion() {
		return this.idTipoAtencion;
	}

	public void setIdTipoAtencion(int idTipoAtencion) {
		this.idTipoAtencion = idTipoAtencion;
	}

	public String getTipoAtencion() {
		return this.tipoAtencion;
	}

	public void setTipoAtencion(String tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}

}