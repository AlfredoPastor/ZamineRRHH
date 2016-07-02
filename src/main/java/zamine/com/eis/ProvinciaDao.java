package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Provincia;

public interface ProvinciaDao {

	public List<Provincia> findAllProvincia();

	public Provincia findProvinciaById(Provincia provincia);

	public void insertProvincia(Provincia provincia);

	public void updateProvincia(Provincia provincia);

	public void deleteProvincia(Provincia provincia);
}