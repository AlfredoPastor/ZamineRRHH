package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the regimenpensionario database table.
 * 
 */
@Entity
@NamedQuery(name="Regimenpensionario.findAll", query="SELECT r FROM Regimenpensionario r")
public class Regimenpensionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRegimenPensionario;

	private String regimenPensionario;

	public Regimenpensionario() {
	}

	public int getIdRegimenPensionario() {
		return this.idRegimenPensionario;
	}

	public void setIdRegimenPensionario(int idRegimenPensionario) {
		this.idRegimenPensionario = idRegimenPensionario;
	}

	public String getRegimenPensionario() {
		return this.regimenPensionario;
	}

	public void setRegimenPensionario(String regimenPensionario) {
		this.regimenPensionario = regimenPensionario;
	}

}