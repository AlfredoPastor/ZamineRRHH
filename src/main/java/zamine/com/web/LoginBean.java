package zamine.com.web;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.sym.Name;

@ManagedBean(name = "loginBean")
@SessionScoped
/**
 *
 * @author User
 */
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String clave;
	private String message, nombre;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String login() {
		
		

		if (nombre.equals("admin") && clave.equals("admin"))
			return "personal.xhtml?faces-redirect=true";
		else {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "LOGIN INVALIDO!", "POR FAVOR INTENTA NUEVAMENTE!"));

			return "login";
		}

		/*
		 * 
		 * boolean result = UserDAO.login(nombre, clave); if (result) { // get
		 * Http Session and store username HttpSession session =
		 * Util.getSession(); session.setAttribute("username", uname);
		 * 
		 * return "home"; } else {
		 * 
		 * FacesContext.getCurrentInstance().addMessage( null, new
		 * FacesMessage(FacesMessage.SEVERITY_WARN, "Invalid Login!",
		 * "Please Try Again!"));
		 * 
		 * // invalidate session, and redirect to other pages
		 * 
		 * //message = "Invalid Login. Please Try Again!"; return "login"; }
		 * 
		 */
	}

	/*public String logout() {
	HttpSession session = Util.getSession();
		session.invalidate();
		return "login";
	}*/
}