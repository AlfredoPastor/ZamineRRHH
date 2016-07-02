package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the distrito database table.
 * 
 */
@Entity
@NamedQuery(name="Distrito.findAll", query="SELECT d FROM Distrito d")
public class Distrito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDistrito;

	private String distrito;

	//bi-directional many-to-one association to Provincia
	@ManyToOne
	@JoinColumn(name="idProvincia")
	private Provincia provincia;

	//bi-directional many-to-one association to Informacionacademica
	@OneToMany(mappedBy="distrito")
	private List<Informacionacademica> informacionacademicas;

	//bi-directional many-to-one association to Trabajador
	@OneToMany(mappedBy="distrito")
	private List<Trabajador> trabajadors;

	public Distrito() {
	}

	public int getIdDistrito() {
		return this.idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getDistrito() {
		return this.distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Informacionacademica> getInformacionacademicas() {
		return this.informacionacademicas;
	}

	public void setInformacionacademicas(List<Informacionacademica> informacionacademicas) {
		this.informacionacademicas = informacionacademicas;
	}

	public Informacionacademica addInformacionacademica(Informacionacademica informacionacademica) {
		getInformacionacademicas().add(informacionacademica);
		informacionacademica.setDistrito(this);

		return informacionacademica;
	}

	public Informacionacademica removeInformacionacademica(Informacionacademica informacionacademica) {
		getInformacionacademicas().remove(informacionacademica);
		informacionacademica.setDistrito(null);

		return informacionacademica;
	}

	public List<Trabajador> getTrabajadors() {
		return this.trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}

	public Trabajador addTrabajador(Trabajador trabajador) {
		getTrabajadors().add(trabajador);
		trabajador.setDistrito(this);

		return trabajador;
	}

	public Trabajador removeTrabajador(Trabajador trabajador) {
		getTrabajadors().remove(trabajador);
		trabajador.setDistrito(null);

		return trabajador;
	}

}