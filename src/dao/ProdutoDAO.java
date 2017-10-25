package dao;

import java.util.List;

import model.Produto;

public interface ProdutoDAO {
	
	void inserir(Produto produto);
	void excluir(int id);
	void atualizar(Produto produto, int id);
	List<Produto> pesquisar(String local);
	
}
