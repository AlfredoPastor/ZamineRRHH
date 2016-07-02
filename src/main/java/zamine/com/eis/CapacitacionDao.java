package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Capacitacion;

public interface CapacitacionDao {

	public List<Capacitacion> findAllCapacitacion();

	public Capacitacion findCapacitacionById(Capacitacion capacitacion);

	public void insertCapacitacion(Capacitacion capacitacion);

	public void updateCapacitacion(Capacitacion capacitacion);

	public void deleteCapacitacion(Capacitacion capacitacion);
}