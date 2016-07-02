package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Planilla;

public interface PlanillaDao {

	public List<Planilla> findAllPlanilla();

	public Planilla findPlanillaById(Planilla planilla);

	public void insertPlanilla(Planilla planilla);

	public void updatePlanilla(Planilla planilla);

	public void deletePlanilla(Planilla planilla);
}