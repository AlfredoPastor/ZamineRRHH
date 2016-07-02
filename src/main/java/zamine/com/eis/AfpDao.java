package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Afp;

public interface AfpDao {

	public List<Afp> findAllAfp();

	public Afp findAfpById(Afp afp);

	public void insertAfp(Afp afp);

	public void updateAfp(Afp afp);

	public void deleteAfp(Afp afp);
}