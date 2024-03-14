package pokemon;

import java.util.ArrayList;
import java.util.List;

public class TreinadorPokemon {
	
	private String nome;
	private List<Pokemon> pokemonsCapturados = new ArrayList<>();
	
	public TreinadorPokemon() {
		
	}

	public TreinadorPokemon(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibirPokemons() {
		System.out.println("OLÁ TREINADOR "+ nome + ". ESSES SÃO OS SEUS POKEMONS ATÉ O MOMENTO: ");
		
		for(Pokemon pokemon: pokemonsCapturados) {
			System.out.println(pokemon.exibirInfo());
		}
		
	}
	

	public void capturarPokemon(Pokemon pokemon) {
		System.out.println();
		System.out.println("-------------ANALISANDO-------------");
		System.out.println("-------------POKEMON CAPTURADO------");
		System.out.println();
		pokemonsCapturados.add(pokemon);
		
	}
	
	public void treinarPokemon(String nomePokemon) {
		
		for (Pokemon pokemon : pokemonsCapturados) {
			if(nomePokemon.equals(pokemon.getNome())) {
				pokemon.setPoderAtaque(pokemon.getPoderAtaque() + 50);
				pokemon.setPoderDefesa(pokemon.getPoderDefesa() + 25);
				pokemon.setNivel(pokemon.getNivel() + 1);
			}
		}
	}
	
	
	
	
}
