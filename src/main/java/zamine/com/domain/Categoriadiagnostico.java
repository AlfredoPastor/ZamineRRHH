package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categoriadiagnostico database table.
 * 
 */
@Entity
@NamedQuery(name="Categoriadiagnostico.findAll", query="SELECT c FROM Categoriadiagnostico c")
public class Categoriadiagnostico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCategoriaDiagnostico;

	private String categoriaDiagnostico;

	private String codigo;

	public Categoriadiagnostico() {
	}

	public int getIdCategoriaDiagnostico() {
		return this.idCategoriaDiagnostico;
	}

	public void setIdCategoriaDiagnostico(int idCategoriaDiagnostico) {
		this.idCategoriaDiagnostico = idCategoriaDiagnostico;
	}

	public String getCategoriaDiagnostico() {
		return this.categoriaDiagnostico;
	}

	public void setCategoriaDiagnostico(String categoriaDiagnostico) {
		this.categoriaDiagnostico = categoriaDiagnostico;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}