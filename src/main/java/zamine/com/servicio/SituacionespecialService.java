package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Situacionespecial;

@Local
public interface SituacionespecialService {

	public List<Situacionespecial> listarSituacionespecial();
	
	public Situacionespecial encontrarSituacionespecialPorId(Situacionespecial situacionespecial);

	public void registrarSituacionespecial(Situacionespecial situacionespecial);

	public void modificarSituacionespecial(Situacionespecial situacionespecial);

	public void eliminarSituacionespecial(Situacionespecial situacionespecial);
}