package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Prestamo;

public interface PrestamoDao {

	public List<Prestamo> findAllPrestamo();

	public Prestamo findPrestamoById(Prestamo prestamo);

	public void insertPrestamo(Prestamo prestamo);

	public void updatePrestamo(Prestamo prestamo);

	public void deletePrestamo(Prestamo prestamo);
}