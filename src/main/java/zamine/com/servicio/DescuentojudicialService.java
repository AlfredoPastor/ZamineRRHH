package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Descuentojudicial;

@Local
public interface DescuentojudicialService {

	public List<Descuentojudicial> listarDescuentojudicial();
	
	public Descuentojudicial encontrarDescuentojudicialPorId(Descuentojudicial descuentojudicial);

	public void registrarDescuentojudicial(Descuentojudicial descuentojudicial);

	public void modificarDescuentojudicial(Descuentojudicial descuentojudicial);

	public void eliminarDescuentojudicial(Descuentojudicial descuentojudicial);
}