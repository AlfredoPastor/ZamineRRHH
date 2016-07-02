package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Derechohabiente;

public interface DerechohabienteDao {

	public List<Derechohabiente> findAllDerechohabiente();

	public Derechohabiente findDerechohabienteById(Derechohabiente derechohabiente);

	public void insertDerechohabiente(Derechohabiente derechohabiente);

	public void updateDerechohabiente(Derechohabiente derechohabiente);

	public void deleteDerechohabiente(Derechohabiente derechohabiente);
}