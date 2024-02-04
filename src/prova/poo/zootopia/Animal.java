package prova.poo.zootopia;

public class Animal {
	
	
	private String nome;
	private String especie;
	private int idade;
	
	public Animal() {
		
	}

	public Animal(String nome, String especie, int idade) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", especie=" + especie + ", idade=" + idade + "]";
	}
	
}
