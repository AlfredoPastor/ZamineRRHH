package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Motivocese;

public interface MotivoceseDao {

	public List<Motivocese> findAllMotivocese();

	public Motivocese findMotivoceseById(Motivocese motivocese);

	public void insertMotivocese(Motivocese motivocese);

	public void updateMotivocese(Motivocese motivocese);

	public void deleteMotivocese(Motivocese motivocese);
}