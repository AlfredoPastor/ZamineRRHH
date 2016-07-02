package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Cuentabancaria;

public interface CuentabancariaDao {

	public List<Cuentabancaria> findAllCuentabancaria();

	public Cuentabancaria findCuentabancariaById(Cuentabancaria cuentabancaria);

	public void insertCuentabancaria(Cuentabancaria cuentabancaria);

	public void updateCuentabancaria(Cuentabancaria cuentabancaria);

	public void deleteCuentabancaria(Cuentabancaria cuentabancaria);
}