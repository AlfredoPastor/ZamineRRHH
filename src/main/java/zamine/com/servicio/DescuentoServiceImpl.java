package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Descuento;
import zamine.com.eis.DescuentoDao;

@Stateless
public class DescuentoServiceImpl implements DescuentoService {
	
	@EJB
	private DescuentoDao descuentoDao;

	public List<Descuento> listarDescuento() {
		return descuentoDao.findAllDescuento();
	}

	public Descuento encontrarDescuentoPorId(Descuento descuento) {
		return descuentoDao.findDescuentoById(descuento);
	}

	public void registrarDescuento(Descuento descuento) {
		descuentoDao.insertDescuento(descuento);
	}

	public void modificarDescuento(Descuento descuento) {
		descuentoDao.updateDescuento(descuento);
	}

	public void eliminarDescuento(Descuento descuento) {
		descuentoDao.deleteDescuento(descuento);
	}

}