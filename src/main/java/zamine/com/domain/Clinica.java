package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clinica database table.
 * 
 */
@Entity
@NamedQuery(name="Clinica.findAll", query="SELECT c FROM Clinica c")
public class Clinica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idClinica;

	private String clinica;

	public Clinica() {
	}

	public int getIdClinica() {
		return this.idClinica;
	}

	public void setIdClinica(int idClinica) {
		this.idClinica = idClinica;
	}

	public String getClinica() {
		return this.clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}

}