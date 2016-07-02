package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the amonestacionreconocimiento database table.
 * 
 */
@Entity
@NamedQuery(name="Amonestacionreconocimiento.findAll", query="SELECT a FROM Amonestacionreconocimiento a")
public class Amonestacionreconocimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAmonestacionReconocimiento;

	private String cuerpo;

	private String encabezado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int idTrabajador;

	private int idUsuario;

	private String tipo;

	public Amonestacionreconocimiento() {
	}

	public int getIdAmonestacionReconocimiento() {
		return this.idAmonestacionReconocimiento;
	}

	public void setIdAmonestacionReconocimiento(int idAmonestacionReconocimiento) {
		this.idAmonestacionReconocimiento = idAmonestacionReconocimiento;
	}

	public String getCuerpo() {
		return this.cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getEncabezado() {
		return this.encabezado;
	}

	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}