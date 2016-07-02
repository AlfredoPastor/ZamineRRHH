package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Motivocese;
import zamine.com.eis.MotivoceseDao;

@Stateless
public class MotivoceseServiceImpl implements MotivoceseService {
	
	@EJB
	private MotivoceseDao motivoceseDao;

	public List<Motivocese> listarMotivocese() {
		return motivoceseDao.findAllMotivocese();
	}

	public Motivocese encontrarMotivocesePorId(Motivocese motivocese) {
		return motivoceseDao.findMotivoceseById(motivocese);
	}

	public void registrarMotivocese(Motivocese motivocese) {
		motivoceseDao.insertMotivocese(motivocese);
	}

	public void modificarMotivocese(Motivocese motivocese) {
		motivoceseDao.updateMotivocese(motivocese);
	}

	public void eliminarMotivocese(Motivocese motivocese) {
		motivoceseDao.deleteMotivocese(motivocese);
	}

}