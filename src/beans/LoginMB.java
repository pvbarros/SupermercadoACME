package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Usuario;

@ManagedBean
@ViewScoped
public class LoginMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Usuario> lista;
	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void login(){
		System.out.println("Login realizado com sucesso.");
	}
	
	public String registrar(){
		lista.add(usuario);
		usuario = new Usuario();
		System.out.println("Registrar invocado, lista possui " + lista.size() + " usuário");
		return registrar();
	}

}
