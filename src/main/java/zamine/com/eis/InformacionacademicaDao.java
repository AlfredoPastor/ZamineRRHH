package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Informacionacademica;

public interface InformacionacademicaDao {

	public List<Informacionacademica> findAllInformacionacademica();

	public Informacionacademica findInformacionacademicaById(Informacionacademica informacionacademica);

	public void insertInformacionacademica(Informacionacademica informacionacademica);

	public void updateInformacionacademica(Informacionacademica informacionacademica);

	public void deleteInformacionacademica(Informacionacademica informacionacademica);
}