package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Experiencialaboral;

public interface ExperiencialaboralDao {

	public List<Experiencialaboral> findAllExperiencialaboral();

	public Experiencialaboral findExperiencialaboralById(Experiencialaboral experiencialaboral);

	public void insertExperiencialaboral(Experiencialaboral experiencialaboral);

	public void updateExperiencialaboral(Experiencialaboral experiencialaboral);

	public void deleteExperiencialaboral(Experiencialaboral experiencialaboral);
}