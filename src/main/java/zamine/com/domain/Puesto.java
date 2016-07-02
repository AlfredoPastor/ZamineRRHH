package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the puesto database table.
 * 
 */
@Entity
@NamedQuery(name="Puesto.findAll", query="SELECT p FROM Puesto p")
public class Puesto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPuesto;

	private String puesto;

	public Puesto() {
	}

	public int getIdPuesto() {
		return this.idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}