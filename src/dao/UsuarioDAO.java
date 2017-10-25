package dao;

import model.Usuario;

public interface UsuarioDAO {
	
	Usuario login(String user, String password);
	void inserir(Usuario usuario);

}
