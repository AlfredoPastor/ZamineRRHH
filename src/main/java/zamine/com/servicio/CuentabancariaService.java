package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Cuentabancaria;

@Local
public interface CuentabancariaService {

	public List<Cuentabancaria> listarCuentabancaria();
	
	public Cuentabancaria encontrarCuentabancariaPorId(Cuentabancaria cuentabancaria);

	public void registrarCuentabancaria(Cuentabancaria cuentabancaria);

	public void modificarCuentabancaria(Cuentabancaria cuentabancaria);

	public void eliminarCuentabancaria(Cuentabancaria cuentabancaria);
}