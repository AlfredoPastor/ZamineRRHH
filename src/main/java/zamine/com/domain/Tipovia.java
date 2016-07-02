package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipovia database table.
 * 
 */
@Entity
@NamedQuery(name="Tipovia.findAll", query="SELECT t FROM Tipovia t")
public class Tipovia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTipoVia;

	private String tipoVia;

	//bi-directional many-to-one association to Trabajador
	@OneToMany(mappedBy="tipovia")
	private List<Trabajador> trabajadors;

	public Tipovia() {
	}

	public int getIdTipoVia() {
		return this.idTipoVia;
	}

	public void setIdTipoVia(int idTipoVia) {
		this.idTipoVia = idTipoVia;
	}

	public String getTipoVia() {
		return this.tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public List<Trabajador> getTrabajadors() {
		return this.trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}

	public Trabajador addTrabajador(Trabajador trabajador) {
		getTrabajadors().add(trabajador);
		trabajador.setTipovia(this);

		return trabajador;
	}

	public Trabajador removeTrabajador(Trabajador trabajador) {
		getTrabajadors().remove(trabajador);
		trabajador.setTipovia(null);

		return trabajador;
	}

}