package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Tipocontrato;

public interface TipocontratoDao {

	public List<Tipocontrato> findAllTipocontrato();

	public Tipocontrato findTipocontratoById(Tipocontrato tipocontrato);

	public void insertTipocontrato(Tipocontrato tipocontrato);

	public void updateTipocontrato(Tipocontrato tipocontrato);

	public void deleteTipocontrato(Tipocontrato tipocontrato);
}