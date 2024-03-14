package pokemon;

public class Pokemon {
	
	private String nome;
	private String tipo;
	private int nivel;
	private int poderAtaque;
	private int poderDefesa;
	
	public Pokemon() {
		
	}

	public Pokemon(String nome, String tipo, int nivel, int poderAtaque, int poderDefesa) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.poderAtaque = poderAtaque;
		this.poderDefesa = poderDefesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	public int getPoderDefesa() {
		return poderDefesa;
	}

	public void setPoderDefesa(int poderDefesa) {
		this.poderDefesa = poderDefesa;
	}
	
	public String exibirInfo() {
		return
	"O Pokemon se chama: "+ nome + ", ele é do tipo: "+ tipo + ". Seu nivel de poder é: "
	+ nivel + " e além disso seu poder de ataque e defesa são: " + poderAtaque+ ", " + poderDefesa
	;
	}
	
	
	
	
}
