package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Cuentabancaria;
import zamine.com.eis.CuentabancariaDao;

@Stateless
public class CuentabancariaServiceImpl implements CuentabancariaService {
	
	@EJB
	private CuentabancariaDao cuentabancariaDao;

	public List<Cuentabancaria> listarCuentabancaria() {
		return cuentabancariaDao.findAllCuentabancaria();
	}

	public Cuentabancaria encontrarCuentabancariaPorId(Cuentabancaria cuentabancaria) {
		return cuentabancariaDao.findCuentabancariaById(cuentabancaria);
	}

	public void registrarCuentabancaria(Cuentabancaria cuentabancaria) {
		cuentabancariaDao.insertCuentabancaria(cuentabancaria);
	}

	public void modificarCuentabancaria(Cuentabancaria cuentabancaria) {
		cuentabancariaDao.updateCuentabancaria(cuentabancaria);
	}

	public void eliminarCuentabancaria(Cuentabancaria cuentabancaria) {
		cuentabancariaDao.deleteCuentabancaria(cuentabancaria);
	}

}