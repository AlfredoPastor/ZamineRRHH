package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Entidadprestadoraservicio;

public interface EntidadprestadoraservicioDao {

	public List<Entidadprestadoraservicio> findAllEntidadprestadoraservicio();

	public Entidadprestadoraservicio findEntidadprestadoraservicioById(Entidadprestadoraservicio entidadprestadoraservicio);

	public void insertEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio);

	public void updateEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio);

	public void deleteEntidadprestadoraservicio(Entidadprestadoraservicio entidadprestadoraservicio);
}