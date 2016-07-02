package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entidadbancaria database table.
 * 
 */
@Entity
@NamedQuery(name="Entidadbancaria.findAll", query="SELECT e FROM Entidadbancaria e")
public class Entidadbancaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEntidadBancaria;

	private String entidadBancaria;

	public Entidadbancaria() {
	}

	public int getIdEntidadBancaria() {
		return this.idEntidadBancaria;
	}

	public void setIdEntidadBancaria(int idEntidadBancaria) {
		this.idEntidadBancaria = idEntidadBancaria;
	}

	public String getEntidadBancaria() {
		return this.entidadBancaria;
	}

	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}

}