package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Trabajador;

public interface TrabajadorDao {

	public List<Trabajador> findAllTrabajador();

	public Trabajador findTrabajadorById(Trabajador trabajador);

	public void insertTrabajador(Trabajador trabajador);

	public void updateTrabajador(Trabajador trabajador);

	public void deleteTrabajador(Trabajador trabajador);
}