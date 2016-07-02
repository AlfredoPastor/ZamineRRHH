package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parentesco database table.
 * 
 */
@Entity
@NamedQuery(name="Parentesco.findAll", query="SELECT p FROM Parentesco p")
public class Parentesco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idParentesco;

	private String parentesco;

	public Parentesco() {
	}

	public int getIdParentesco() {
		return this.idParentesco;
	}

	public void setIdParentesco(int idParentesco) {
		this.idParentesco = idParentesco;
	}

	public String getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

}