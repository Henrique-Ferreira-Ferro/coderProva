package prova.poo.zootopia;

import java.util.ArrayList;
import java.util.List;

public class Cage {
	
	private int numeroCage;
	private int capacidade;
	
	private List<Animal> animais = new ArrayList<>();
	
	
	public Cage() {
		
	}


	public Cage(int numeroCage, int capacidade) {
		super();
		this.numeroCage = numeroCage;
		this.capacidade = capacidade;
	}


	public int getNumeroCage() {
		return numeroCage;
	}


	public void setNumeroCage(int numeroCage) {
		this.numeroCage = numeroCage;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public List<Animal> getAnimais() {
		return animais;
	}
	
	
	public void adicionar_bichinhos(Animal animal) {
		if(animais.size() < capacidade) {
			this.animais.add(animal);
		}else {
			System.out.println("A gaiola já está proxima da capacidade máxima :(");
		}
	}
	
	public void exibir_animais() {
		for(Animal a: animais) {
			System.out.println(a.getNome() + " da especie: " + a.getEspecie()
			+ " tem: " + a.getIdade()+ " anos. Ele está na gaiola: "+ this.getNumeroCage() );
		}
	}
	
	
}
