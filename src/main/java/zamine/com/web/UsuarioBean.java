package zamine.com.web;

import java.security.Principal;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import zamine.com.domain.Usuario;
import zamine.com.servicio.UsuarioService;

import org.primefaces.event.RowEditEvent;

@ManagedBean
@RequestScoped
public class UsuarioBean {
	@EJB
	private UsuarioService usuarioService;
	List<Usuario> usuarios;

	@ManagedProperty(value = "#{usuario}")
	private Usuario usuario;
	
	public UsuarioBean() {
	}

	@PostConstruct
	public void inicializar() {
		usuarios = usuarioService.listarUsuario();
		
		usuario = new Usuario();
		
		System.out.println("Dentro de usuario");
	}
	
	public void registrarUsuario() {

		System.out.println("dentro de registrarUsuario " + this.usuario.getNombres());

		usuario.setNombres(usuario.getNombres().toUpperCase());
		usuario.setApellidoPaterno(usuario.getApellidoPaterno().toUpperCase());
		usuario.setApellidoMaterno(usuario.getApellidoMaterno().toUpperCase());
		usuario.setNombreUsuario(usuario.getNombreUsuario());
		usuario.setPassword(usuario.getPassword());
		usuario.setAdministrador(usuario.getAdministrador());

		
		usuarioService.registrarUsuario(usuario);
		
		refrescarLista();
		
	}
	
	public void refrescarLista() {

		this.usuarioService.listarUsuario();

	}

	public void editListener(RowEditEvent event) {
		Usuario usuario = (Usuario) event.getObject();
		usuarioService.modificarUsuario(usuario);
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	



}