package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the situacionespecial database table.
 * 
 */
@Entity
@NamedQuery(name="Situacionespecial.findAll", query="SELECT s FROM Situacionespecial s")
public class Situacionespecial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSituacionEspecial;

	private String situacionEspecial;

	public Situacionespecial() {
	}

	public int getIdSituacionEspecial() {
		return this.idSituacionEspecial;
	}

	public void setIdSituacionEspecial(int idSituacionEspecial) {
		this.idSituacionEspecial = idSituacionEspecial;
	}

	public String getSituacionEspecial() {
		return this.situacionEspecial;
	}

	public void setSituacionEspecial(String situacionEspecial) {
		this.situacionEspecial = situacionEspecial;
	}

}