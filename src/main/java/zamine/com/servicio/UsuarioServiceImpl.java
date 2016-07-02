package zamine.com.servicio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import zamine.com.domain.Usuario;
import zamine.com.eis.UsuarioDao;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {
	
	@EJB
	private UsuarioDao usuarioDao;

	public List<Usuario> listarUsuario() {
		return usuarioDao.findAllUsuario();
	}

	public Usuario encontrarUsuarioPorId(Usuario usuario) {
		return usuarioDao.findUsuarioById(usuario);
	}

	public void registrarUsuario(Usuario usuario) {
		usuarioDao.insertUsuario(usuario);
	}

	public void modificarUsuario(Usuario usuario) {
		usuarioDao.updateUsuario(usuario);
	}

	public void eliminarUsuario(Usuario usuario) {
		usuarioDao.deleteUsuario(usuario);
	}

}