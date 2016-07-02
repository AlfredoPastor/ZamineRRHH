package zamine.com.eis;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import zamine.com.domain.Site;

@Stateless
public class SiteDaoImpl implements SiteDao {

	@PersistenceContext(unitName = "ZaminePU")
	EntityManager em;

	@SuppressWarnings("unchecked")
	//@Override
	public List<Site> findAllSite() {
		return em.createNamedQuery("Site.findAll").getResultList();
	}

	//@Override
	public Site findSiteById(Site site) {
		return em.find(Site.class, site.getIdSite());
	}

	//@Override
	public void insertSite(Site site) {
		em.persist(site);
	}

	//@Override
	public void updateSite(Site site) {
		em.merge( site );
	}

	//@Override
	public void deleteSite(Site site) {
		em.merge(site);
		em.remove( site );
	}

}