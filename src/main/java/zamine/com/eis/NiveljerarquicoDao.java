package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Niveljerarquico;

public interface NiveljerarquicoDao {

	public List<Niveljerarquico> findAllNiveljerarquico();

	public Niveljerarquico findNiveljerarquicoById(Niveljerarquico niveljerarquico);

	public void insertNiveljerarquico(Niveljerarquico niveljerarquico);

	public void updateNiveljerarquico(Niveljerarquico niveljerarquico);

	public void deleteNiveljerarquico(Niveljerarquico niveljerarquico);
}