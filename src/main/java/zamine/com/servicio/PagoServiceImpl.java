package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Pago;
import zamine.com.eis.PagoDao;

@Stateless
public class PagoServiceImpl implements PagoService {
	
	@EJB
	private PagoDao pagoDao;

	public List<Pago> listarPago() {
		return pagoDao.findAllPago();
	}

	public Pago encontrarPagoPorId(Pago pago) {
		return pagoDao.findPagoById(pago);
	}

	public void registrarPago(Pago pago) {
		pagoDao.insertPago(pago);
	}

	public void modificarPago(Pago pago) {
		pagoDao.updatePago(pago);
	}

	public void eliminarPago(Pago pago) {
		pagoDao.deletePago(pago);
	}

}