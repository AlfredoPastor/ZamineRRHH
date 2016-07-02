package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Area;

@Stateless
public class AreaDaoImpl implements AreaDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Area> findAllArea() {
		return em.createNamedQuery("Area.findAll").getResultList();
	}

	//@Override
	public Area findAreaById(Area area) {
		return em.find(Area.class, area.getIdArea());
	}

	//@Override
	public void insertArea(Area area) {
		em.persist(area);
	}

	//@Override
	public void updateArea(Area area) {
		em.merge( area );
	}

	//@Override
	public void deleteArea(Area area) {
		em.merge(area);
		em.remove( area );
	}

}