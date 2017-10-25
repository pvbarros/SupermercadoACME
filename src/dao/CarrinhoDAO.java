package dao;

import java.util.List;

import model.Carrinho;

public interface CarrinhoDAO {
	
	void inserir(Carrinho carrinho);
	void excluir(int id);
	void atualizar(Carrinho carrinho, int id);
	List<Carrinho> pesquisar(String local);
	

}
