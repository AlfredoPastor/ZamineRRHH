package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Pago;

public interface PagoDao {

	public List<Pago> findAllPago();

	public Pago findPagoById(Pago pago);

	public void insertPago(Pago pago);

	public void updatePago(Pago pago);

	public void deletePago(Pago pago);
}