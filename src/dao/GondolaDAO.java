package dao;

import java.util.List;

import model.Gondola;

public interface GondolaDAO {
	
	void inserir(Gondola gondola);
	void excluir(int id);
	void atualizar(Gondola gondola, int id);
	List<Gondola> pesquisar(String local);
	
}
