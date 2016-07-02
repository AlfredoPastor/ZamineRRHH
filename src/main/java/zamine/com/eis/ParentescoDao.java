package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Parentesco;

public interface ParentescoDao {

	public List<Parentesco> findAllParentesco();

	public Parentesco findParentescoById(Parentesco parentesco);

	public void insertParentesco(Parentesco parentesco);

	public void updateParentesco(Parentesco parentesco);

	public void deleteParentesco(Parentesco parentesco);
}