package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Area;

@Local
public interface AreaService {

	public List<Area> listarArea();
	
	public Area encontrarAreaPorId(Area area);

	public void registrarArea(Area area);

	public void modificarArea(Area area);

	public void eliminarArea(Area area);
}