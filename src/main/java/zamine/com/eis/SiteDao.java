package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Site;

public interface SiteDao {

	public List<Site> findAllSite();

	public Site findSiteById(Site site);

	public void insertSite(Site site);

	public void updateSite(Site site);

	public void deleteSite(Site site);
}