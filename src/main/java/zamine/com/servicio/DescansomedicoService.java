package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Descansomedico;

@Local
public interface DescansomedicoService {

	public List<Descansomedico> listarDescansomedico();
	
	public Descansomedico encontrarDescansomedicoPorId(Descansomedico descansomedico);

	public void registrarDescansomedico(Descansomedico descansomedico);

	public void modificarDescansomedico(Descansomedico descansomedico);

	public void eliminarDescansomedico(Descansomedico descansomedico);
}