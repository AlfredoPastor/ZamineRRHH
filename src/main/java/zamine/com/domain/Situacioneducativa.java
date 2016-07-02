package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the situacioneducativa database table.
 * 
 */
@Entity
@NamedQuery(name="Situacioneducativa.findAll", query="SELECT s FROM Situacioneducativa s")
public class Situacioneducativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSituacionEducativa;

	private String situacionEducativa;

	//bi-directional many-to-one association to Informacionacademica
	@OneToMany(mappedBy="situacioneducativa")
	private List<Informacionacademica> informacionacademicas;

	public Situacioneducativa() {
	}

	public int getIdSituacionEducativa() {
		return this.idSituacionEducativa;
	}

	public void setIdSituacionEducativa(int idSituacionEducativa) {
		this.idSituacionEducativa = idSituacionEducativa;
	}

	public String getSituacionEducativa() {
		return this.situacionEducativa;
	}

	public void setSituacionEducativa(String situacionEducativa) {
		this.situacionEducativa = situacionEducativa;
	}

	public List<Informacionacademica> getInformacionacademicas() {
		return this.informacionacademicas;
	}

	public void setInformacionacademicas(List<Informacionacademica> informacionacademicas) {
		this.informacionacademicas = informacionacademicas;
	}

	public Informacionacademica addInformacionacademica(Informacionacademica informacionacademica) {
		getInformacionacademicas().add(informacionacademica);
		informacionacademica.setSituacioneducativa(this);

		return informacionacademica;
	}

	public Informacionacademica removeInformacionacademica(Informacionacademica informacionacademica) {
		getInformacionacademicas().remove(informacionacademica);
		informacionacademica.setSituacioneducativa(null);

		return informacionacademica;
	}

}