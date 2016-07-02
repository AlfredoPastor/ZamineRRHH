package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Regimenpensionario;

public interface RegimenpensionarioDao {

	public List<Regimenpensionario> findAllRegimenpensionario();

	public Regimenpensionario findRegimenpensionarioById(Regimenpensionario regimenpensionario);

	public void insertRegimenpensionario(Regimenpensionario regimenpensionario);

	public void updateRegimenpensionario(Regimenpensionario regimenpensionario);

	public void deleteRegimenpensionario(Regimenpensionario regimenpensionario);
}