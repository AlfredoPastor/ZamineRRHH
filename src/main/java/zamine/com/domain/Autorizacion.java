package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the autorizacion database table.
 * 
 */
@Entity
@NamedQuery(name="Autorizacion.findAll", query="SELECT a FROM Autorizacion a")
public class Autorizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAutorizacion;

	private int idTrabajador;

	private int idUsuario;

	private String tipoAutorizacion;

	public Autorizacion() {
	}

	public int getIdAutorizacion() {
		return this.idAutorizacion;
	}

	public void setIdAutorizacion(int idAutorizacion) {
		this.idAutorizacion = idAutorizacion;
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

	public String getTipoAutorizacion() {
		return this.tipoAutorizacion;
	}

	public void setTipoAutorizacion(String tipoAutorizacion) {
		this.tipoAutorizacion = tipoAutorizacion;
	}

}