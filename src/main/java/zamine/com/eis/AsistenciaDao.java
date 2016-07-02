package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Asistencia;

public interface AsistenciaDao {

	public List<Asistencia> findAllAsistencia();

	public Asistencia findAsistenciaById(Asistencia asistencia);

	public void insertAsistencia(Asistencia asistencia);

	public void updateAsistencia(Asistencia asistencia);

	public void deleteAsistencia(Asistencia asistencia);
}