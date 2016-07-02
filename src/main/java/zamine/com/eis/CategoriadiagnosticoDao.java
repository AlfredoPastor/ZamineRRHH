package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Categoriadiagnostico;

public interface CategoriadiagnosticoDao {

	public List<Categoriadiagnostico> findAllCategoriadiagnostico();

	public Categoriadiagnostico findCategoriadiagnosticoById(Categoriadiagnostico categoriadiagnostico);

	public void insertCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico);

	public void updateCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico);

	public void deleteCategoriadiagnostico(Categoriadiagnostico categoriadiagnostico);
}