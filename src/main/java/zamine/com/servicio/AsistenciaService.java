package zamine.com.servicio;

import java.util.List;
import javax.ejb.Local;

import zamine.com.domain.Asistencia;

@Local
public interface AsistenciaService {

	public List<Asistencia> listarAsistencia();
	
	public Asistencia encontrarAsistenciaPorId(Asistencia asistencia);

	public void registrarAsistencia(Asistencia asistencia);

	public void modificarAsistencia(Asistencia asistencia);

	public void eliminarAsistencia(Asistencia asistencia);
}