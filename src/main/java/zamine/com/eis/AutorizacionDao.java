package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Autorizacion;

public interface AutorizacionDao {

	public List<Autorizacion> findAllAutorizacion();

	public Autorizacion findAutorizacionById(Autorizacion autorizacion);

	public void insertAutorizacion(Autorizacion autorizacion);

	public void updateAutorizacion(Autorizacion autorizacion);

	public void deleteAutorizacion(Autorizacion autorizacion);
}