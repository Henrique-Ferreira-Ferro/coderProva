package clinicaVeterinaria;

public class Gato extends Animal{
	
	public Gato(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("O Gato mia :v");
	}
	
}
