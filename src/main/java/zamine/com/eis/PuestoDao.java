package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Puesto;

public interface PuestoDao {

	public List<Puesto> findAllPuesto();

	public Puesto findPuestoById(Puesto puesto);

	public void insertPuesto(Puesto puesto);

	public void updatePuesto(Puesto puesto);

	public void deletePuesto(Puesto puesto);
}