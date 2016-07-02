package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Planilla;

@Local
public interface PlanillaService {

	public List<Planilla> listarPlanilla();
	
	public Planilla encontrarPlanillaPorId(Planilla planilla);

	public void registrarPlanilla(Planilla planilla);

	public void modificarPlanilla(Planilla planilla);

	public void eliminarPlanilla(Planilla planilla);
}