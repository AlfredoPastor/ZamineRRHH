package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the planilla database table.
 * 
 */
@Entity
@NamedQuery(name="Planilla.findAll", query="SELECT p FROM Planilla p")
public class Planilla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPlanilla;

	private int anioRetencionQuinta;

	private String archivoRetencionQuinta;

	private BigDecimal devolucion;

	@Temporal(TemporalType.DATE)
	private Date fechaAfiliacionEPS;

	private int idEntidadBancaria;

	private int idEntidadBancariaCTS;

	private int idEPS;

	private int idTrabajador;

	private int idUsuario;

	private BigDecimal impuestoRetenido;

	private String monedaCTS;

	private String monedaEntidadBancaria;

	private String numeroCuentaCTS;

	private String numeroCuentaEntidadBancaria;

	private byte pagoPorCheque;

	private BigDecimal remuneracion;

	private BigDecimal rentaBruta;

	private String situacionEspecial;

	public Planilla() {
	}

	public int getIdPlanilla() {
		return this.idPlanilla;
	}

	public void setIdPlanilla(int idPlanilla) {
		this.idPlanilla = idPlanilla;
	}

	public int getAnioRetencionQuinta() {
		return this.anioRetencionQuinta;
	}

	public void setAnioRetencionQuinta(int anioRetencionQuinta) {
		this.anioRetencionQuinta = anioRetencionQuinta;
	}

	public String getArchivoRetencionQuinta() {
		return this.archivoRetencionQuinta;
	}

	public void setArchivoRetencionQuinta(String archivoRetencionQuinta) {
		this.archivoRetencionQuinta = archivoRetencionQuinta;
	}

	public BigDecimal getDevolucion() {
		return this.devolucion;
	}

	public void setDevolucion(BigDecimal devolucion) {
		this.devolucion = devolucion;
	}

	public Date getFechaAfiliacionEPS() {
		return this.fechaAfiliacionEPS;
	}

	public void setFechaAfiliacionEPS(Date fechaAfiliacionEPS) {
		this.fechaAfiliacionEPS = fechaAfiliacionEPS;
	}

	public int getIdEntidadBancaria() {
		return this.idEntidadBancaria;
	}

	public void setIdEntidadBancaria(int idEntidadBancaria) {
		this.idEntidadBancaria = idEntidadBancaria;
	}

	public int getIdEntidadBancariaCTS() {
		return this.idEntidadBancariaCTS;
	}

	public void setIdEntidadBancariaCTS(int idEntidadBancariaCTS) {
		this.idEntidadBancariaCTS = idEntidadBancariaCTS;
	}

	public int getIdEPS() {
		return this.idEPS;
	}

	public void setIdEPS(int idEPS) {
		this.idEPS = idEPS;
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

	public BigDecimal getImpuestoRetenido() {
		return this.impuestoRetenido;
	}

	public void setImpuestoRetenido(BigDecimal impuestoRetenido) {
		this.impuestoRetenido = impuestoRetenido;
	}

	public String getMonedaCTS() {
		return this.monedaCTS;
	}

	public void setMonedaCTS(String monedaCTS) {
		this.monedaCTS = monedaCTS;
	}

	public String getMonedaEntidadBancaria() {
		return this.monedaEntidadBancaria;
	}

	public void setMonedaEntidadBancaria(String monedaEntidadBancaria) {
		this.monedaEntidadBancaria = monedaEntidadBancaria;
	}

	public String getNumeroCuentaCTS() {
		return this.numeroCuentaCTS;
	}

	public void setNumeroCuentaCTS(String numeroCuentaCTS) {
		this.numeroCuentaCTS = numeroCuentaCTS;
	}

	public String getNumeroCuentaEntidadBancaria() {
		return this.numeroCuentaEntidadBancaria;
	}

	public void setNumeroCuentaEntidadBancaria(String numeroCuentaEntidadBancaria) {
		this.numeroCuentaEntidadBancaria = numeroCuentaEntidadBancaria;
	}

	public byte getPagoPorCheque() {
		return this.pagoPorCheque;
	}

	public void setPagoPorCheque(byte pagoPorCheque) {
		this.pagoPorCheque = pagoPorCheque;
	}

	public BigDecimal getRemuneracion() {
		return this.remuneracion;
	}

	public void setRemuneracion(BigDecimal remuneracion) {
		this.remuneracion = remuneracion;
	}

	public BigDecimal getRentaBruta() {
		return this.rentaBruta;
	}

	public void setRentaBruta(BigDecimal rentaBruta) {
		this.rentaBruta = rentaBruta;
	}

	public String getSituacionEspecial() {
		return this.situacionEspecial;
	}

	public void setSituacionEspecial(String situacionEspecial) {
		this.situacionEspecial = situacionEspecial;
	}

}