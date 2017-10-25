package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import dao.ProdutoDAO;
import model.Produto;

@ManagedBean
public class ProdutoMB implements ProdutoDAO, Serializable {

	private static final long serialVersionUID = -1124494491508532308L;
	private List<Produto> lista = new ArrayList<Produto>();
	private Produto produto = new Produto();
	
	public Produto getProduto(){
		return produto;
	}
	
	public void setProduto(Produto produto){
		this.produto = produto;
	}

	@Override
	public void inserir(Produto produto) {
		lista.add(produto);
		produto = new Produto();
		System.out.println(lista.size() + " produtos adicionados.");
	}

	@Override
	public void excluir(int id) {
		
	}

	@Override
	public void atualizar(Produto produto, int id) {
		
	}

	@Override
	public List<Produto> pesquisar(String local) {
		return null;
	}
	

}
