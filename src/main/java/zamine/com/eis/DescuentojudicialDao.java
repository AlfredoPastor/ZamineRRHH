package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Descuentojudicial;

public interface DescuentojudicialDao {

	public List<Descuentojudicial> findAllDescuentojudicial();

	public Descuentojudicial findDescuentojudicialById(Descuentojudicial descuentojudicial);

	public void insertDescuentojudicial(Descuentojudicial descuentojudicial);

	public void updateDescuentojudicial(Descuentojudicial descuentojudicial);

	public void deleteDescuentojudicial(Descuentojudicial descuentojudicial);
}