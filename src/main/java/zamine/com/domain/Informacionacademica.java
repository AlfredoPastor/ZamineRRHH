package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the informacionacademica database table.
 * 
 */
@Entity
@NamedQuery(name="Informacionacademica.findAll", query="SELECT i FROM Informacionacademica i")
public class Informacionacademica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idInformacionAcademica;

	private String carrera;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idUsuario;

	private String institucion;

	//bi-directional many-to-one association to Distrito
	@ManyToOne
	@JoinColumn(name="IdDistritoEstudios")
	private Distrito distrito;

	//bi-directional many-to-one association to Situacioneducativa
	@ManyToOne
	@JoinColumn(name="IdSituacionEducativa")
	private Situacioneducativa situacioneducativa;

	//bi-directional many-to-one association to Trabajador
	@ManyToOne
	@JoinColumn(name="idTrabajador")
	private Trabajador trabajador;

	public Informacionacademica() {
	}

	public int getIdInformacionAcademica() {
		return this.idInformacionAcademica;
	}

	public void setIdInformacionAcademica(int idInformacionAcademica) {
		this.idInformacionAcademica = idInformacionAcademica;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
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

	public Distrito getDistrito() {
		return this.distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Situacioneducativa getSituacioneducativa() {
		return this.situacioneducativa;
	}

	public void setSituacioneducativa(Situacioneducativa situacioneducativa) {
		this.situacioneducativa = situacioneducativa;
	}

	public Trabajador getTrabajador() {
		return this.trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

}