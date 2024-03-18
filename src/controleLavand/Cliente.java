package controleLavand;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int id;
	private String nome;
	private String endereco;
	private int numTelefone;
	private String email;
	
	//Um cliente pode ter muitos pedidos
	private List<Pedido> pedidos = new ArrayList<>();
	
	public Cliente() {
		
	}

	public Cliente(String nome, String endereco, int numTelefone, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numTelefone = numTelefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(int numTelefone) {
		this.numTelefone = numTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void SetPedidos(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", numTelefone=" + numTelefone + ", email=" + email
				+ ", pedidos=" + pedidos + "]";
	}
	
	
}
