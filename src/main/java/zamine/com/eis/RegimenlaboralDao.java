package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Regimenlaboral;

public interface RegimenlaboralDao {

	public List<Regimenlaboral> findAllRegimenlaboral();

	public Regimenlaboral findRegimenlaboralById(Regimenlaboral regimenlaboral);

	public void insertRegimenlaboral(Regimenlaboral regimenlaboral);

	public void updateRegimenlaboral(Regimenlaboral regimenlaboral);

	public void deleteRegimenlaboral(Regimenlaboral regimenlaboral);
}