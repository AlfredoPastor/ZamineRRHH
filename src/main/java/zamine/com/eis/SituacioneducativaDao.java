package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Situacioneducativa;

public interface SituacioneducativaDao {

	public List<Situacioneducativa> findAllSituacioneducativa();

	public Situacioneducativa findSituacioneducativaById(Situacioneducativa situacioneducativa);

	public void insertSituacioneducativa(Situacioneducativa situacioneducativa);

	public void updateSituacioneducativa(Situacioneducativa situacioneducativa);

	public void deleteSituacioneducativa(Situacioneducativa situacioneducativa);
}