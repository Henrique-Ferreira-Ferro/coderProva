package pokemon;

public class Program {

	public static void main(String[] args) {

		System.out.println("----------------------------------");
		System.out.println("POKEMON - ");
		
		Pokemon p1 = new Pokemon("Picachu","raio",1,25,23);
		Pokemon p2 = new Pokemon("Gingar","Ghost",2,15,20);
		Pokemon p3 = new Pokemon("Cindaquil","Fogo",2,55,13);
		
		TreinadorPokemon t1 = new TreinadorPokemon("Ash");
		
		t1.capturarPokemon(p1);
		t1.capturarPokemon(p2);
		
		t1.exibirPokemons();
		
		t1.treinarPokemon("Picachu");
		t1.exibirPokemons();
		
	}

}
