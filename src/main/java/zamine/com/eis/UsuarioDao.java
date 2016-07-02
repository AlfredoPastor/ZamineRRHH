package zamine.com.eis;

import java.util.List;

import zamine.com.domain.Usuario;

public interface UsuarioDao {

	public List<Usuario> findAllUsuario();

	public Usuario findUsuarioById(Usuario usuario);

	public void insertUsuario(Usuario usuario);

	public void updateUsuario(Usuario usuario);

	public void deleteUsuario(Usuario usuario);
}