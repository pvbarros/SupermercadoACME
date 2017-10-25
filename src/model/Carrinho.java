package model;

import java.util.List;

public class Carrinho {
	
	private int id;
	private String nome;
	private float total;
	private List<Produto> listaProdutos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	

}
