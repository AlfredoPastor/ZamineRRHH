package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Distrito;

public interface DistritoDao {

	public List<Distrito> findAllDistrito();

	public Distrito findDistritoById(Distrito distrito);

	public void insertDistrito(Distrito distrito);

	public void updateDistrito(Distrito distrito);

	public void deleteDistrito(Distrito distrito);
}