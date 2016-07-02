package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Tipozona;

@Local
public interface TipozonaService {

	public List<Tipozona> listarTipozona();
	
	public Tipozona encontrarTipozonaPorId(Tipozona tipozona);

	public void registrarTipozona(Tipozona tipozona);

	public void modificarTipozona(Tipozona tipozona);

	public void eliminarTipozona(Tipozona tipozona);
}