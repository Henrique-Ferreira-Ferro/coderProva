package nasa;

public class Tripulante {
	
	private String nome;
	private int idade;
	private String[] funcao = {"piloto","engenheiro","cientista"};
	
	public Tripulante() {
		
	}

	public Tripulante(String nome, int idade, String[] funcao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String[] getFuncao() {
		return funcao;
	}

	public void setFuncao(String[] funcao) {
		this.funcao = funcao;
	}
	
	
	
	
	
}
