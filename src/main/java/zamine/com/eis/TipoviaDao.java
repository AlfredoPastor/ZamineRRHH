package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Tipovia;

public interface TipoviaDao {

	public List<Tipovia> findAllTipovia();

	public Tipovia findTipoviaById(Tipovia tipovia);

	public void insertTipovia(Tipovia tipovia);

	public void updateTipovia(Tipovia tipovia);

	public void deleteTipovia(Tipovia tipovia);
}