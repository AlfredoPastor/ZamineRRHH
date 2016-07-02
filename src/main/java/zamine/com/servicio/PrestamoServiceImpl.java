package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Prestamo;
import zamine.com.eis.PrestamoDao;

@Stateless
public class PrestamoServiceImpl implements PrestamoService {
	
	@EJB
	private PrestamoDao prestamoDao;

	public List<Prestamo> listarPrestamo() {
		return prestamoDao.findAllPrestamo();
	}

	public Prestamo encontrarPrestamoPorId(Prestamo prestamo) {
		return prestamoDao.findPrestamoById(prestamo);
	}

	public void registrarPrestamo(Prestamo prestamo) {
		prestamoDao.insertPrestamo(prestamo);
	}

	public void modificarPrestamo(Prestamo prestamo) {
		prestamoDao.updatePrestamo(prestamo);
	}

	public void eliminarPrestamo(Prestamo prestamo) {
		prestamoDao.deletePrestamo(prestamo);
	}

}