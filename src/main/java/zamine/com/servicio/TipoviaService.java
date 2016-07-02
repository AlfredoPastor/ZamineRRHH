package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Tipovia;

@Local
public interface TipoviaService {

	public List<Tipovia> listarTipovia();
	
	public Tipovia encontrarTipoviaPorId(Tipovia tipovia);

	public void registrarTipovia(Tipovia tipovia);

	public void modificarTipovia(Tipovia tipovia);

	public void eliminarTipovia(Tipovia tipovia);
}