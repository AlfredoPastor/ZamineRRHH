package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the experiencialaboral database table.
 * 
 */
@Entity
@NamedQuery(name="Experiencialaboral.findAll", query="SELECT e FROM Experiencialaboral e")
public class Experiencialaboral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idExperienciaLaboral;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idUsuario;

	private String institucion;

	private String puesto;

	private BigDecimal remuneracion;

	//bi-directional many-to-one association to Motivocese
	@ManyToOne
	@JoinColumn(name="idMotivoCese")
	private Motivocese motivocese;

	//bi-directional many-to-one association to Trabajador
	@ManyToOne
	@JoinColumn(name="idTrabajador")
	private Trabajador trabajador;

	public Experiencialaboral() {
	}

	public int getIdExperienciaLaboral() {
		return this.idExperienciaLaboral;
	}

	public void setIdExperienciaLaboral(int idExperienciaLaboral) {
		this.idExperienciaLaboral = idExperienciaLaboral;
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

	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public BigDecimal getRemuneracion() {
		return this.remuneracion;
	}

	public void setRemuneracion(BigDecimal remuneracion) {
		this.remuneracion = remuneracion;
	}

	public Motivocese getMotivocese() {
		return this.motivocese;
	}

	public void setMotivocese(Motivocese motivocese) {
		this.motivocese = motivocese;
	}

	public Trabajador getTrabajador() {
		return this.trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

}