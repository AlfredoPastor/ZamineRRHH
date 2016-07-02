package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAsistencia;

	private String archivoRegistroAsistencia;

	private int descansoMedico;

	private int descansoMedicoSubsidiado;

	private int descansoPreYPostNatal;

	private int diasNormalesTrabajados;

	private int faltasInjustificadas;

	@Temporal(TemporalType.DATE)
	private Date fechaControl;

	@Temporal(TemporalType.DATE)
	private Date fechaFinVaciones;

	@Temporal(TemporalType.DATE)
	private Date fechaInicioVaciones;

	private int horasExtra100;

	private int horasExtra35;

	private int horasExtra50;

	private int idTrabajador;

	private int idUsuario;

	private int licenciaPorAdopcion;

	private int licenciaPorPaternidad;

	private int permisosConGoseDeHaber;

	private int permisosSinGoseDeHaber;

	private int suspencionDelTrabajo;

	private int totalHorasOrdinarias;

	private int vacaciones;

	public Asistencia() {
	}

	public int getIdAsistencia() {
		return this.idAsistencia;
	}

	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public String getArchivoRegistroAsistencia() {
		return this.archivoRegistroAsistencia;
	}

	public void setArchivoRegistroAsistencia(String archivoRegistroAsistencia) {
		this.archivoRegistroAsistencia = archivoRegistroAsistencia;
	}

	public int getDescansoMedico() {
		return this.descansoMedico;
	}

	public void setDescansoMedico(int descansoMedico) {
		this.descansoMedico = descansoMedico;
	}

	public int getDescansoMedicoSubsidiado() {
		return this.descansoMedicoSubsidiado;
	}

	public void setDescansoMedicoSubsidiado(int descansoMedicoSubsidiado) {
		this.descansoMedicoSubsidiado = descansoMedicoSubsidiado;
	}

	public int getDescansoPreYPostNatal() {
		return this.descansoPreYPostNatal;
	}

	public void setDescansoPreYPostNatal(int descansoPreYPostNatal) {
		this.descansoPreYPostNatal = descansoPreYPostNatal;
	}

	public int getDiasNormalesTrabajados() {
		return this.diasNormalesTrabajados;
	}

	public void setDiasNormalesTrabajados(int diasNormalesTrabajados) {
		this.diasNormalesTrabajados = diasNormalesTrabajados;
	}

	public int getFaltasInjustificadas() {
		return this.faltasInjustificadas;
	}

	public void setFaltasInjustificadas(int faltasInjustificadas) {
		this.faltasInjustificadas = faltasInjustificadas;
	}

	public Date getFechaControl() {
		return this.fechaControl;
	}

	public void setFechaControl(Date fechaControl) {
		this.fechaControl = fechaControl;
	}

	public Date getFechaFinVaciones() {
		return this.fechaFinVaciones;
	}

	public void setFechaFinVaciones(Date fechaFinVaciones) {
		this.fechaFinVaciones = fechaFinVaciones;
	}

	public Date getFechaInicioVaciones() {
		return this.fechaInicioVaciones;
	}

	public void setFechaInicioVaciones(Date fechaInicioVaciones) {
		this.fechaInicioVaciones = fechaInicioVaciones;
	}

	public int getHorasExtra100() {
		return this.horasExtra100;
	}

	public void setHorasExtra100(int horasExtra100) {
		this.horasExtra100 = horasExtra100;
	}

	public int getHorasExtra35() {
		return this.horasExtra35;
	}

	public void setHorasExtra35(int horasExtra35) {
		this.horasExtra35 = horasExtra35;
	}

	public int getHorasExtra50() {
		return this.horasExtra50;
	}

	public void setHorasExtra50(int horasExtra50) {
		this.horasExtra50 = horasExtra50;
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

	public int getLicenciaPorAdopcion() {
		return this.licenciaPorAdopcion;
	}

	public void setLicenciaPorAdopcion(int licenciaPorAdopcion) {
		this.licenciaPorAdopcion = licenciaPorAdopcion;
	}

	public int getLicenciaPorPaternidad() {
		return this.licenciaPorPaternidad;
	}

	public void setLicenciaPorPaternidad(int licenciaPorPaternidad) {
		this.licenciaPorPaternidad = licenciaPorPaternidad;
	}

	public int getPermisosConGoseDeHaber() {
		return this.permisosConGoseDeHaber;
	}

	public void setPermisosConGoseDeHaber(int permisosConGoseDeHaber) {
		this.permisosConGoseDeHaber = permisosConGoseDeHaber;
	}

	public int getPermisosSinGoseDeHaber() {
		return this.permisosSinGoseDeHaber;
	}

	public void setPermisosSinGoseDeHaber(int permisosSinGoseDeHaber) {
		this.permisosSinGoseDeHaber = permisosSinGoseDeHaber;
	}

	public int getSuspencionDelTrabajo() {
		return this.suspencionDelTrabajo;
	}

	public void setSuspencionDelTrabajo(int suspencionDelTrabajo) {
		this.suspencionDelTrabajo = suspencionDelTrabajo;
	}

	public int getTotalHorasOrdinarias() {
		return this.totalHorasOrdinarias;
	}

	public void setTotalHorasOrdinarias(int totalHorasOrdinarias) {
		this.totalHorasOrdinarias = totalHorasOrdinarias;
	}

	public int getVacaciones() {
		return this.vacaciones;
	}

	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}

}