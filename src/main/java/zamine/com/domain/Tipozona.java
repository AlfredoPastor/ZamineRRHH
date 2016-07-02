package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipozona database table.
 * 
 */
@Entity
@NamedQuery(name="Tipozona.findAll", query="SELECT t FROM Tipozona t")
public class Tipozona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoZona;

	private String tipoZona;

	//bi-directional many-to-one association to Trabajador
	@OneToMany(mappedBy="tipozona")
	private List<Trabajador> trabajadors;

	public Tipozona() {
	}

	public int getIdTipoZona() {
		return this.idTipoZona;
	}

	public void setIdTipoZona(int idTipoZona) {
		this.idTipoZona = idTipoZona;
	}

	public String getTipoZona() {
		return this.tipoZona;
	}

	public void setTipoZona(String tipoZona) {
		this.tipoZona = tipoZona;
	}

	public List<Trabajador> getTrabajadors() {
		return this.trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}

	public Trabajador addTrabajador(Trabajador trabajador) {
		getTrabajadors().add(trabajador);
		trabajador.setTipozona(this);

		return trabajador;
	}

	public Trabajador removeTrabajador(Trabajador trabajador) {
		getTrabajadors().remove(trabajador);
		trabajador.setTipozona(null);

		return trabajador;
	}

}