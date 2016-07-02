package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Contrato;

@Local
public interface ContratoService {

	public List<Contrato> listarContrato();
	
	public Contrato encontrarContratoPorId(Contrato contrato);

	public void registrarContrato(Contrato contrato);

	public void modificarContrato(Contrato contrato);

	public void eliminarContrato(Contrato contrato);
}