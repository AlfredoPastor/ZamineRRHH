package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Parentesco;

@Local
public interface ParentescoService {

	public List<Parentesco> listarParentesco();
	
	public Parentesco encontrarParentescoPorId(Parentesco parentesco);

	public void registrarParentesco(Parentesco parentesco);

	public void modificarParentesco(Parentesco parentesco);

	public void eliminarParentesco(Parentesco parentesco);
}