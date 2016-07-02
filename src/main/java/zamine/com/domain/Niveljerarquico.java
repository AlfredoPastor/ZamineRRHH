package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the niveljerarquico database table.
 * 
 */
@Entity
@NamedQuery(name="Niveljerarquico.findAll", query="SELECT n FROM Niveljerarquico n")
public class Niveljerarquico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idNivelJerarquico;

	private String codigo;

	private String nivelJerarquico;

	public Niveljerarquico() {
	}

	public int getIdNivelJerarquico() {
		return this.idNivelJerarquico;
	}

	public void setIdNivelJerarquico(int idNivelJerarquico) {
		this.idNivelJerarquico = idNivelJerarquico;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNivelJerarquico() {
		return this.nivelJerarquico;
	}

	public void setNivelJerarquico(String nivelJerarquico) {
		this.nivelJerarquico = nivelJerarquico;
	}

}