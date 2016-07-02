package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipocontrato database table.
 * 
 */
@Entity
@NamedQuery(name="Tipocontrato.findAll", query="SELECT t FROM Tipocontrato t")
public class Tipocontrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoContrato;

	private String tipoContrato;

	public Tipocontrato() {
	}

	public int getIdTipoContrato() {
		return this.idTipoContrato;
	}

	public void setIdTipoContrato(int idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}