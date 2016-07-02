package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Site;
import zamine.com.eis.SiteDao;

@Stateless
public class SiteServiceImpl implements SiteService {
	
	@EJB
	private SiteDao siteDao;

	public List<Site> listarSite() {
		return siteDao.findAllSite();
	}

	public Site encontrarSitePorId(Site site) {
		return siteDao.findSiteById(site);
	}

	public void registrarSite(Site site) {
		siteDao.insertSite(site);
	}

	public void modificarSite(Site site) {
		siteDao.updateSite(site);
	}

	public void eliminarSite(Site site) {
		siteDao.deleteSite(site);
	}

}