package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Regimenlaboral;

public interface RegimenlaboraDao {

	public List<Regimenlaboral> findAllRegimenlabora();

	public Regimenlaboral findRegimenlaboraById(Regimenlaboral regimenlabora);

	public void insertRegimenlabora(Regimenlaboral regimenlabora);

	public void updateRegimenlabora(Regimenlaboral regimenlabora);

	public void deleteRegimenlabora(Regimenlaboral regimenlabora);
}