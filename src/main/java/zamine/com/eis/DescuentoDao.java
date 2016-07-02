package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Descuento;

public interface DescuentoDao {

	public List<Descuento> findAllDescuento();

	public Descuento findDescuentoById(Descuento descuento);

	public void insertDescuento(Descuento descuento);

	public void updateDescuento(Descuento descuento);

	public void deleteDescuento(Descuento descuento);
}