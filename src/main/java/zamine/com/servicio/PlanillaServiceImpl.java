package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Planilla;
import zamine.com.eis.PlanillaDao;

@Stateless
public class PlanillaServiceImpl implements PlanillaService {
	
	@EJB
	private PlanillaDao planillaDao;

	public List<Planilla> listarPlanilla() {
		return planillaDao.findAllPlanilla();
	}

	public Planilla encontrarPlanillaPorId(Planilla planilla) {
		return planillaDao.findPlanillaById(planilla);
	}

	public void registrarPlanilla(Planilla planilla) {
		planillaDao.insertPlanilla(planilla);
	}

	public void modificarPlanilla(Planilla planilla) {
		planillaDao.updatePlanilla(planilla);
	}

	public void eliminarPlanilla(Planilla planilla) {
		planillaDao.deletePlanilla(planilla);
	}

}