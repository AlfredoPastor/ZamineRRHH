package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Tipozona;

public interface TipozonaDao {

	public List<Tipozona> findAllTipozona();

	public Tipozona findTipozonaById(Tipozona tipozona);

	public void insertTipozona(Tipozona tipozona);

	public void updateTipozona(Tipozona tipozona);

	public void deleteTipozona(Tipozona tipozona);
}