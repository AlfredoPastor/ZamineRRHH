package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sistemapension database table.
 * 
 */
@Entity
@NamedQuery(name="Sistemapension.findAll", query="SELECT s FROM Sistemapension s")
public class Sistemapension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSistemaPension;

	private int idAfp;

	private int idRegimenPensionario;

	private int idTrabajador;

	private int idUsuario;

	private String tipoComision;

	public Sistemapension() {
	}

	public int getIdSistemaPension() {
		return this.idSistemaPension;
	}

	public void setIdSistemaPension(int idSistemaPension) {
		this.idSistemaPension = idSistemaPension;
	}

	public int getIdAfp() {
		return this.idAfp;
	}

	public void setIdAfp(int idAfp) {
		this.idAfp = idAfp;
	}

	public int getIdRegimenPensionario() {
		return this.idRegimenPensionario;
	}

	public void setIdRegimenPensionario(int idRegimenPensionario) {
		this.idRegimenPensionario = idRegimenPensionario;
	}

	public int getIdTrabajador() {
		return this.idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoComision() {
		return this.tipoComision;
	}

	public void setTipoComision(String tipoComision) {
		this.tipoComision = tipoComision;
	}

}