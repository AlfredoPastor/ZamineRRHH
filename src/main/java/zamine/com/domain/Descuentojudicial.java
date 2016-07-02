package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the descuentojudicial database table.
 * 
 */
@Entity
@NamedQuery(name="Descuentojudicial.findAll", query="SELECT d FROM Descuentojudicial d")
public class Descuentojudicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDescuentoJudicial;

	private String archivoRelacionado;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idTrabajador;

	private int idUsuario;

	private BigDecimal porcentajeIngresoTotal;

	public Descuentojudicial() {
	}

	public int getIdDescuentoJudicial() {
		return this.idDescuentoJudicial;
	}

	public void setIdDescuentoJudicial(int idDescuentoJudicial) {
		this.idDescuentoJudicial = idDescuentoJudicial;
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

	public BigDecimal getPorcentajeIngresoTotal() {
		return this.porcentajeIngresoTotal;
	}

	public void setPorcentajeIngresoTotal(BigDecimal porcentajeIngresoTotal) {
		this.porcentajeIngresoTotal = porcentajeIngresoTotal;
	}

}