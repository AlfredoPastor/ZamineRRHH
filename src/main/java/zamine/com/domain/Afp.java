package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the afp database table.
 * 
 */
@Entity
@NamedQuery(name="Afp.findAll", query="SELECT a FROM Afp a")
public class Afp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAfp;

	private String afp;

	public Afp() {
	}

	public int getIdAfp() {
		return this.idAfp;
	}

	public void setIdAfp(int idAfp) {
		this.idAfp = idAfp;
	}

	public String getAfp() {
		return this.afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

}