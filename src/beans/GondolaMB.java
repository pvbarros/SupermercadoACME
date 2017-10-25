package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import dao.GondolaDAO;
import model.Gondola;

@ManagedBean
public class GondolaMB implements GondolaDAO, Serializable {

	private static final long serialVersionUID = 1L;
	private List<Gondola> lista = new ArrayList<Gondola>();
	private Gondola gondola = new Gondola();
	
	public Gondola getGondola(){
		return gondola;
	}
	
	public void setGondola(Gondola gondola){
		this.gondola = gondola;
	}

	@Override
	public void inserir(Gondola gondola) {
		lista.add(gondola);
		gondola = new Gondola();
		System.out.println(lista.size() + " gondola adicionada");
	}

	@Override
	public void excluir(int id) {
		
	}

	@Override
	public void atualizar(Gondola gondola, int id) {
		
	}

	@Override
	public List<Gondola> pesquisar(String local) {
		return null;
	}


}
