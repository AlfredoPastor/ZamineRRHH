package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Tipocontrato;

@Local
public interface TipocontratoService {

	public List<Tipocontrato> listarTipocontrato();
	
	public Tipocontrato encontrarTipocontratoPorId(Tipocontrato tipocontrato);

	public void registrarTipocontrato(Tipocontrato tipocontrato);

	public void modificarTipocontrato(Tipocontrato tipocontrato);

	public void eliminarTipocontrato(Tipocontrato tipocontrato);
}