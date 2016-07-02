package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the motivocese database table.
 * 
 */
@Entity
@NamedQuery(name="Motivocese.findAll", query="SELECT m FROM Motivocese m")
public class Motivocese implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idMotivoCese;

	private String motivoCese;

	//bi-directional many-to-one association to Experiencialaboral
	@OneToMany(mappedBy="motivocese")
	private List<Experiencialaboral> experiencialaborals;

	public Motivocese() {
	}

	public int getIdMotivoCese() {
		return this.idMotivoCese;
	}

	public void setIdMotivoCese(int idMotivoCese) {
		this.idMotivoCese = idMotivoCese;
	}

	public String getMotivoCese() {
		return this.motivoCese;
	}

	public void setMotivoCese(String motivoCese) {
		this.motivoCese = motivoCese;
	}

	public List<Experiencialaboral> getExperiencialaborals() {
		return this.experiencialaborals;
	}

	public void setExperiencialaborals(List<Experiencialaboral> experiencialaborals) {
		this.experiencialaborals = experiencialaborals;
	}

	public Experiencialaboral addExperiencialaboral(Experiencialaboral experiencialaboral) {
		getExperiencialaborals().add(experiencialaboral);
		experiencialaboral.setMotivocese(this);

		return experiencialaboral;
	}

	public Experiencialaboral removeExperiencialaboral(Experiencialaboral experiencialaboral) {
		getExperiencialaborals().remove(experiencialaboral);
		experiencialaboral.setMotivocese(null);

		return experiencialaboral;
	}

}