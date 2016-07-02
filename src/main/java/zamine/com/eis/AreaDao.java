package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Area;

public interface AreaDao {

	public List<Area> findAllArea();

	public Area findAreaById(Area area);

	public void insertArea(Area area);

	public void updateArea(Area area);

	public void deleteArea(Area area);
}