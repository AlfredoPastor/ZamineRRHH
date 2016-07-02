package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Descuento;

@Local
public interface DescuentoService {

	public List<Descuento> listarDescuento();
	
	public Descuento encontrarDescuentoPorId(Descuento descuento);

	public void registrarDescuento(Descuento descuento);

	public void modificarDescuento(Descuento descuento);

	public void eliminarDescuento(Descuento descuento);
}