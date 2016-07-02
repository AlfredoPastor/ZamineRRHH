package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Descansomedico;

public interface DescansomedicoDao {

	public List<Descansomedico> findAllDescansomedico();

	public Descansomedico findDescansomedicoById(Descansomedico descansomedico);

	public void insertDescansomedico(Descansomedico descansomedico);

	public void updateDescansomedico(Descansomedico descansomedico);

	public void deleteDescansomedico(Descansomedico descansomedico);
}