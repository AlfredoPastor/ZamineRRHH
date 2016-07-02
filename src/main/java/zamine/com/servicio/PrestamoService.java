package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Prestamo;

@Local
public interface PrestamoService {

	public List<Prestamo> listarPrestamo();
	
	public Prestamo encontrarPrestamoPorId(Prestamo prestamo);

	public void registrarPrestamo(Prestamo prestamo);

	public void modificarPrestamo(Prestamo prestamo);

	public void eliminarPrestamo(Prestamo prestamo);
}