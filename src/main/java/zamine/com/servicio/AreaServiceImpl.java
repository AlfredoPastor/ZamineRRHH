package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Area;
import zamine.com.eis.AreaDao;

@Stateless
public class AreaServiceImpl implements AreaService {
	
	@EJB
	private AreaDao areaDao;

	public List<Area> listarArea() {
		return areaDao.findAllArea();
	}

	public Area encontrarAreaPorId(Area area) {
		return areaDao.findAreaById(area);
	}

	public void registrarArea(Area area) {
		areaDao.insertArea(area);
	}

	public void modificarArea(Area area) {
		areaDao.updateArea(area);
	}

	public void eliminarArea(Area area) {
		areaDao.deleteArea(area);
	}

}