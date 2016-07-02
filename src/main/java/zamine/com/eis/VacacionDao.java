package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Vacacion;

public interface VacacionDao {

	public List<Vacacion> findAllVacacion();

	public Vacacion findVacacionById(Vacacion vacacion);

	public void insertVacacion(Vacacion vacacion);

	public void updateVacacion(Vacacion vacacion);

	public void deleteVacacion(Vacacion vacacion);
}