package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Pago;

@Local
public interface PagoService {

	public List<Pago> listarPago();
	
	public Pago encontrarPagoPorId(Pago pago);

	public void registrarPago(Pago pago);

	public void modificarPago(Pago pago);

	public void eliminarPago(Pago pago);
}