package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the derechohabiente database table.
 * 
 */
@Entity
@NamedQuery(name="Derechohabiente.findAll", query="SELECT d FROM Derechohabiente d")
public class Derechohabiente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDerechohabiente;

	private String apellidoMaterno;

	private String apellidoPaterno;

	private String direccionNacimiento;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	private int idDistritoNacimiento;

	private int idParentesco;

	private int idTipoDocumentoIdentidad;

	private int idTipoViaNacimiento;

	private int idTipoZonaNacimiento;

	private int idTrabajador;

	private int idUsuario;

	private String nombres;

	private String numeroDocumentoIdentidad;

	private String sexo;

	public Derechohabiente() {
	}

	public int getIdDerechohabiente() {
		return this.idDerechohabiente;
	}

	public void setIdDerechohabiente(int idDerechohabiente) {
		this.idDerechohabiente = idDerechohabiente;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getDireccionNacimiento() {
		return this.direccionNacimiento;
	}

	public void setDireccionNacimiento(String direccionNacimiento) {
		this.direccionNacimiento = direccionNacimiento;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdDistritoNacimiento() {
		return this.idDistritoNacimiento;
	}

	public void setIdDistritoNacimiento(int idDistritoNacimiento) {
		this.idDistritoNacimiento = idDistritoNacimiento;
	}

	public int getIdParentesco() {
		return this.idParentesco;
	}

	public void setIdParentesco(int idParentesco) {
		this.idParentesco = idParentesco;
	}

	public int getIdTipoDocumentoIdentidad() {
		return this.idTipoDocumentoIdentidad;
	}

	public void setIdTipoDocumentoIdentidad(int idTipoDocumentoIdentidad) {
		this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
	}

	public int getIdTipoViaNacimiento() {
		return this.idTipoViaNacimiento;
	}

	public void setIdTipoViaNacimiento(int idTipoViaNacimiento) {
		this.idTipoViaNacimiento = idTipoViaNacimiento;
	}

	public int getIdTipoZonaNacimiento() {
		return this.idTipoZonaNacimiento;
	}

	public void setIdTipoZonaNacimiento(int idTipoZonaNacimiento) {
		this.idTipoZonaNacimiento = idTipoZonaNacimiento;
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

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNumeroDocumentoIdentidad() {
		return this.numeroDocumentoIdentidad;
	}

	public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
		this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}