package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Situacionespecial;

public interface SituacionespecialDao {

	public List<Situacionespecial> findAllSituacionespecial();

	public Situacionespecial findSituacionespecialById(Situacionespecial situacionespecial);

	public void insertSituacionespecial(Situacionespecial situacionespecial);

	public void updateSituacionespecial(Situacionespecial situacionespecial);

	public void deleteSituacionespecial(Situacionespecial situacionespecial);
}