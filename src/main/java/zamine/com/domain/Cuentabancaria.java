package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cuentabancaria database table.
 * 
 */
@Entity
@NamedQuery(name="Cuentabancaria.findAll", query="SELECT c FROM Cuentabancaria c")
public class Cuentabancaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCuentaBancaria;

	@Temporal(TemporalType.DATE)
	private Date fechaApertura;

	private int idEntidadBancaria;

	private int idTrabajador;

	private int idUsuario;

	private String lugarApertura;

	private String moneda;

	private String numeroCuenta;

	private String tipo;

	public Cuentabancaria() {
	}

	public int getIdCuentaBancaria() {
		return this.idCuentaBancaria;
	}

	public void setIdCuentaBancaria(int idCuentaBancaria) {
		this.idCuentaBancaria = idCuentaBancaria;
	}

	public Date getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getIdEntidadBancaria() {
		return this.idEntidadBancaria;
	}

	public void setIdEntidadBancaria(int idEntidadBancaria) {
		this.idEntidadBancaria = idEntidadBancaria;
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

	public String getLugarApertura() {
		return this.lugarApertura;
	}

	public void setLugarApertura(String lugarApertura) {
		this.lugarApertura = lugarApertura;
	}

	public String getMoneda() {
		return this.moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}