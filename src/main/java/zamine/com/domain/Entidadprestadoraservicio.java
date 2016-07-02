package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entidadprestadoraservicio database table.
 * 
 */
@Entity
@NamedQuery(name="Entidadprestadoraservicio.findAll", query="SELECT e FROM Entidadprestadoraservicio e")
public class Entidadprestadoraservicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEntidadPrestadoraServicio;

	private String eps;

	public Entidadprestadoraservicio() {
	}

	public int getIdEntidadPrestadoraServicio() {
		return this.idEntidadPrestadoraServicio;
	}

	public void setIdEntidadPrestadoraServicio(int idEntidadPrestadoraServicio) {
		this.idEntidadPrestadoraServicio = idEntidadPrestadoraServicio;
	}

	public String getEps() {
		return this.eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

}