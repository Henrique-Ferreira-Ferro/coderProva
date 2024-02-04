package prova.poo.zootopia;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private String nome;
	
	private List<Cage> gaiolas = new ArrayList<>();
	
	public Zoo() {
		
	}
	
	public Zoo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cage> getGaiolas() {
		return gaiolas;
	}
	
	public void exibirInfo() {
		int quant = 0;
		for(Cage c: gaiolas) {
			quant += c.getNumeroCage();
			System.out.println("A gaiola numero: "+ c.getNumeroCage()+ " tem capacidade de: "+ c.getCapacidade()
			+ ". E possui os seguintes bichinhos: " + c.getAnimais());
		}
		System.out.println("No total há: "+ quant+ " gaiolas");
	}
	
	public void adicionaGaiola(Cage cage) {
		gaiolas.add(cage);
		System.out.println("A gaiola numero: "+ cage.getNumeroCage()+ ", foi adicionada ao zoologico: "+ this.getNome());
	}
	
	
}
