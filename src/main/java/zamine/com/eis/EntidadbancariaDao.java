package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Entidadbancaria;

public interface EntidadbancariaDao {

	public List<Entidadbancaria> findAllEntidadbancaria();

	public Entidadbancaria findEntidadbancariaById(Entidadbancaria entidadbancaria);

	public void insertEntidadbancaria(Entidadbancaria entidadbancaria);

	public void updateEntidadbancaria(Entidadbancaria entidadbancaria);

	public void deleteEntidadbancaria(Entidadbancaria entidadbancaria);
}