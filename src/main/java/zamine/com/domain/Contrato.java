package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contrato database table.
 * 
 */
@Entity
@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idContrato;

	private String archivoContrato;

	private String descripcionPuesto;

	private String descripcionStatusChange;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idAreaTrabajo;

	private int idNivelJerarquico;

	private int idPuesto;

	private int idRegimenLaboral;

	private int idSites;

	private int idSituaciónEspecial;

	private int idSupervisorInmediato;

	private int idTipoContrato;

	private int idTrabajador;

	private int idUsuario;

	private String motivoStatusChange;

	private String tipo;

	public Contrato() {
	}

	public int getIdContrato() {
		return this.idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public String getArchivoContrato() {
		return this.archivoContrato;
	}

	public void setArchivoContrato(String archivoContrato) {
		this.archivoContrato = archivoContrato;
	}

	public String getDescripcionPuesto() {
		return this.descripcionPuesto;
	}

	public void setDescripcionPuesto(String descripcionPuesto) {
		this.descripcionPuesto = descripcionPuesto;
	}

	public String getDescripcionStatusChange() {
		return this.descripcionStatusChange;
	}

	public void setDescripcionStatusChange(String descripcionStatusChange) {
		this.descripcionStatusChange = descripcionStatusChange;
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

	public int getIdAreaTrabajo() {
		return this.idAreaTrabajo;
	}

	public void setIdAreaTrabajo(int idAreaTrabajo) {
		this.idAreaTrabajo = idAreaTrabajo;
	}

	public int getIdNivelJerarquico() {
		return this.idNivelJerarquico;
	}

	public void setIdNivelJerarquico(int idNivelJerarquico) {
		this.idNivelJerarquico = idNivelJerarquico;
	}

	public int getIdPuesto() {
		return this.idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public int getIdRegimenLaboral() {
		return this.idRegimenLaboral;
	}

	public void setIdRegimenLaboral(int idRegimenLaboral) {
		this.idRegimenLaboral = idRegimenLaboral;
	}

	public int getIdSites() {
		return this.idSites;
	}

	public void setIdSites(int idSites) {
		this.idSites = idSites;
	}

	public int getIdSituaciónEspecial() {
		return this.idSituaciónEspecial;
	}

	public void setIdSituaciónEspecial(int idSituaciónEspecial) {
		this.idSituaciónEspecial = idSituaciónEspecial;
	}

	public int getIdSupervisorInmediato() {
		return this.idSupervisorInmediato;
	}

	public void setIdSupervisorInmediato(int idSupervisorInmediato) {
		this.idSupervisorInmediato = idSupervisorInmediato;
	}

	public int getIdTipoContrato() {
		return this.idTipoContrato;
	}

	public void setIdTipoContrato(int idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
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

	public String getMotivoStatusChange() {
		return this.motivoStatusChange;
	}

	public void setMotivoStatusChange(String motivoStatusChange) {
		this.motivoStatusChange = motivoStatusChange;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}