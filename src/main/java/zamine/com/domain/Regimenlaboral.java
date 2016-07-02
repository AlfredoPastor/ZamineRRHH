package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the regimenlaboral database table.
 * 
 */
@Entity
@NamedQuery(name="Regimenlaboral.findAll", query="SELECT r FROM Regimenlaboral r")
public class Regimenlaboral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRegimenLaboral;

	private String regimenLaboral;

	public Regimenlaboral() {
	}

	public int getIdRegimenLaboral() {
		return this.idRegimenLaboral;
	}

	public void setIdRegimenLaboral(int idRegimenLaboral) {
		this.idRegimenLaboral = idRegimenLaboral;
	}

	public String getRegimenLaboral() {
		return this.regimenLaboral;
	}

	public void setRegimenLaboral(String regimenLaboral) {
		this.regimenLaboral = regimenLaboral;
	}

}