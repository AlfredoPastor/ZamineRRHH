package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Site;

@Local
public interface SiteService {

	public List<Site> listarSite();
	
	public Site encontrarSitePorId(Site site);

	public void registrarSite(Site site);

	public void modificarSite(Site site);

	public void eliminarSite(Site site);
}