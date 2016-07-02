package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Tipoatencion;

public interface TipoatencionDao {

	public List<Tipoatencion> findAllTipoatencion();

	public Tipoatencion findTipoatencionById(Tipoatencion tipoatencion);

	public void insertTipoatencion(Tipoatencion tipoatencion);

	public void updateTipoatencion(Tipoatencion tipoatencion);

	public void deleteTipoatencion(Tipoatencion tipoatencion);
}