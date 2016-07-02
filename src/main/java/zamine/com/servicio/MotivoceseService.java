package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Motivocese;

@Local
public interface MotivoceseService {

	public List<Motivocese> listarMotivocese();
	
	public Motivocese encontrarMotivocesePorId(Motivocese motivocese);

	public void registrarMotivocese(Motivocese motivocese);

	public void modificarMotivocese(Motivocese motivocese);

	public void eliminarMotivocese(Motivocese motivocese);
}