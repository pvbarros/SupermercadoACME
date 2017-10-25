package model;

public class Produto {
	
	private int id;
	private float preco;
	private float peso;
	private String nome;
	private Character tipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Character getTipo() {
		return tipo;
	}
	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}
	
	

}
