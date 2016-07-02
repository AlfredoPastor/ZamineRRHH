package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Tipoatencion;

@Local
public interface TipoatencionService {

	public List<Tipoatencion> listarTipoatencion();
	
	public Tipoatencion encontrarTipoatencionPorId(Tipoatencion tipoatencion);

	public void registrarTipoatencion(Tipoatencion tipoatencion);

	public void modificarTipoatencion(Tipoatencion tipoatencion);

	public void eliminarTipoatencion(Tipoatencion tipoatencion);
}