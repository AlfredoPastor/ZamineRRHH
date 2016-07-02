package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Sistemapension;

public interface SistemapensionDao {

	public List<Sistemapension> findAllSistemapension();

	public Sistemapension findSistemapensionById(Sistemapension sistemapension);

	public void insertSistemapension(Sistemapension sistemapension);

	public void updateSistemapension(Sistemapension sistemapension);

	public void deleteSistemapension(Sistemapension sistemapension);
}