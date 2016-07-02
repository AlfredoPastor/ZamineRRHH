package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Contrato;
import zamine.com.eis.ContratoDao;

@Stateless
public class ContratoServiceImpl implements ContratoService {
	
	@EJB
	private ContratoDao contratoDao;

	public List<Contrato> listarContrato() {
		return contratoDao.findAllContrato();
	}

	public Contrato encontrarContratoPorId(Contrato contrato) {
		return contratoDao.findContratoById(contrato);
	}

	public void registrarContrato(Contrato contrato) {
		contratoDao.insertContrato(contrato);
	}

	public void modificarContrato(Contrato contrato) {
		contratoDao.updateContrato(contrato);
	}

	public void eliminarContrato(Contrato contrato) {
		contratoDao.deleteContrato(contrato);
	}

}