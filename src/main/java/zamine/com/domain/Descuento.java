package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the descuento database table.
 * 
 */
@Entity
@NamedQuery(name="Descuento.findAll", query="SELECT d FROM Descuento d")
public class Descuento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDescuento;

	private String archivoRelacionado;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idTrabajador;

	private int idUsuario;

	private String justificacion;

	private int mesesDeDescuento;

	private BigDecimal monto;

	private String motivo;

	public Descuento() {
	}

	public int getIdDescuento() {
		return this.idDescuento;
	}

	public void setIdDescuento(int idDescuento) {
		this.idDescuento = idDescuento;
	}

	public String getArchivoRelacionado() {
		return this.archivoRelacionado;
	}

	public void setArchivoRelacionado(String archivoRelacionado) {
		this.archivoRelacionado = archivoRelacionado;
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

	public String getJustificacion() {
		return this.justificacion;
	}

	public void setJustificacion(String justificacion) {
		this.justificacion = justificacion;
	}

	public int getMesesDeDescuento() {
		return this.mesesDeDescuento;
	}

	public void setMesesDeDescuento(int mesesDeDescuento) {
		this.mesesDeDescuento = mesesDeDescuento;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}