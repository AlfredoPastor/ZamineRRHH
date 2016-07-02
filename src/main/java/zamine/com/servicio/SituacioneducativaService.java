package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Situacioneducativa;

@Local
public interface SituacioneducativaService {

	public List<Situacioneducativa> listarSituacioneducativa();
	
	public Situacioneducativa encontrarSituacioneducativaPorId(Situacioneducativa situacioneducativa);

	public void registrarSituacioneducativa(Situacioneducativa situacioneducativa);

	public void modificarSituacioneducativa(Situacioneducativa situacioneducativa);

	public void eliminarSituacioneducativa(Situacioneducativa situacioneducativa);
}