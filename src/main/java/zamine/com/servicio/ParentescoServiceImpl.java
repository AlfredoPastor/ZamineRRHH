package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Parentesco;
import zamine.com.eis.ParentescoDao;

@Stateless
public class ParentescoServiceImpl implements ParentescoService {
	
	@EJB
	private ParentescoDao parentescoDao;

	public List<Parentesco> listarParentesco() {
		return parentescoDao.findAllParentesco();
	}

	public Parentesco encontrarParentescoPorId(Parentesco parentesco) {
		return parentescoDao.findParentescoById(parentesco);
	}

	public void registrarParentesco(Parentesco parentesco) {
		parentescoDao.insertParentesco(parentesco);
	}

	public void modificarParentesco(Parentesco parentesco) {
		parentescoDao.updateParentesco(parentesco);
	}

	public void eliminarParentesco(Parentesco parentesco) {
		parentescoDao.deleteParentesco(parentesco);
	}

}