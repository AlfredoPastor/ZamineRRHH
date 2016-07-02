package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Contrato;

public interface ContratoDao {

	public List<Contrato> findAllContrato();

	public Contrato findContratoById(Contrato contrato);

	public void insertContrato(Contrato contrato);

	public void updateContrato(Contrato contrato);

	public void deleteContrato(Contrato contrato);
}