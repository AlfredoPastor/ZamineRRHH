package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Amonestacionreconocimiento;

public interface AmonestacionreconocimientoDao {

	public List<Amonestacionreconocimiento> findAllAmonestacionreconocimiento();

	public Amonestacionreconocimiento findAmonestacionreconocimientoById(Amonestacionreconocimiento amonestacionreconocimiento);

	public void insertAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento);

	public void updateAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento);

	public void deleteAmonestacionreconocimiento(Amonestacionreconocimiento amonestacionreconocimiento);
}