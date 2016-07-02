package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vacacion database table.
 * 
 */
@Entity
@NamedQuery(name="Vacacion.findAll", query="SELECT v FROM Vacacion v")
public class Vacacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idVacacion;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idTrabajador;

	private int idUsuario;

	private int numeroDias;

	private String observaciones;

	private String tipo;

	public Vacacion() {
	}

	public int getIdVacacion() {
		return this.idVacacion;
	}

	public void setIdVacacion(int idVacacion) {
		this.idVacacion = idVacacion;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
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

	public int getNumeroDias() {
		return this.numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}