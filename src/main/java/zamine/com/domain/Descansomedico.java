package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the descansomedico database table.
 * 
 */
@Entity
@NamedQuery(name="Descansomedico.findAll", query="SELECT d FROM Descansomedico d")
public class Descansomedico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDescansoMedico;

	@Column(name="CITT_CMP")
	private String cittCmp;

	private String contingencia;

	private String detalleAtencion;

	private String diagnostico;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idCategoriaDiagnostico;

	private int idClinica;

	private int idTipoAtencion;

	private int idTrabajador;

	private int idUsuario;

	private String medico;

	public Descansomedico() {
	}

	public int getIdDescansoMedico() {
		return this.idDescansoMedico;
	}

	public void setIdDescansoMedico(int idDescansoMedico) {
		this.idDescansoMedico = idDescansoMedico;
	}

	public String getCittCmp() {
		return this.cittCmp;
	}

	public void setCittCmp(String cittCmp) {
		this.cittCmp = cittCmp;
	}

	public String getContingencia() {
		return this.contingencia;
	}

	public void setContingencia(String contingencia) {
		this.contingencia = contingencia;
	}

	public String getDetalleAtencion() {
		return this.detalleAtencion;
	}

	public void setDetalleAtencion(String detalleAtencion) {
		this.detalleAtencion = detalleAtencion;
	}

	public String getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
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

	public int getIdCategoriaDiagnostico() {
		return this.idCategoriaDiagnostico;
	}

	public void setIdCategoriaDiagnostico(int idCategoriaDiagnostico) {
		this.idCategoriaDiagnostico = idCategoriaDiagnostico;
	}

	public int getIdClinica() {
		return this.idClinica;
	}

	public void setIdClinica(int idClinica) {
		this.idClinica = idClinica;
	}

	public int getIdTipoAtencion() {
		return this.idTipoAtencion;
	}

	public void setIdTipoAtencion(int idTipoAtencion) {
		this.idTipoAtencion = idTipoAtencion;
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

	public String getMedico() {
		return this.medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

}