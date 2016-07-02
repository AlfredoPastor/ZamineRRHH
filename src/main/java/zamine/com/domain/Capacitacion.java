package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the capacitacion database table.
 * 
 */
@Entity
@NamedQuery(name="Capacitacion.findAll", query="SELECT c FROM Capacitacion c")
public class Capacitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCapacitacion;

	private String archivoCapacitacion;

	private BigDecimal baseCalificacion;

	private String calificacion;

	private BigDecimal costoCurso;

	private String direccion;

	private int idDistrito;

	private int idSite;

	private int idTipoVia;

	private int idTipoZona;

	private int idTrabajador;

	private int idUsuario;

	private String institucion;

	private String internaExterna;

	private String nombreCapacitacion;

	private String ponente;

	private BigDecimal puntaje;

	private String tipoCapacitacion;

	public Capacitacion() {
	}

	public int getIdCapacitacion() {
		return this.idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getArchivoCapacitacion() {
		return this.archivoCapacitacion;
	}

	public void setArchivoCapacitacion(String archivoCapacitacion) {
		this.archivoCapacitacion = archivoCapacitacion;
	}

	public BigDecimal getBaseCalificacion() {
		return this.baseCalificacion;
	}

	public void setBaseCalificacion(BigDecimal baseCalificacion) {
		this.baseCalificacion = baseCalificacion;
	}

	public String getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public BigDecimal getCostoCurso() {
		return this.costoCurso;
	}

	public void setCostoCurso(BigDecimal costoCurso) {
		this.costoCurso = costoCurso;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getIdDistrito() {
		return this.idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public int getIdSite() {
		return this.idSite;
	}

	public void setIdSite(int idSite) {
		this.idSite = idSite;
	}

	public int getIdTipoVia() {
		return this.idTipoVia;
	}

	public void setIdTipoVia(int idTipoVia) {
		this.idTipoVia = idTipoVia;
	}

	public int getIdTipoZona() {
		return this.idTipoZona;
	}

	public void setIdTipoZona(int idTipoZona) {
		this.idTipoZona = idTipoZona;
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

	public String getInstitucion() {
		return this.institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getInternaExterna() {
		return this.internaExterna;
	}

	public void setInternaExterna(String internaExterna) {
		this.internaExterna = internaExterna;
	}

	public String getNombreCapacitacion() {
		return this.nombreCapacitacion;
	}

	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}

	public String getPonente() {
		return this.ponente;
	}

	public void setPonente(String ponente) {
		this.ponente = ponente;
	}

	public BigDecimal getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(BigDecimal puntaje) {
		this.puntaje = puntaje;
	}

	public String getTipoCapacitacion() {
		return this.tipoCapacitacion;
	}

	public void setTipoCapacitacion(String tipoCapacitacion) {
		this.tipoCapacitacion = tipoCapacitacion;
	}

}