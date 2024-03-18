package controleLavand;

import java.util.Arrays;

public class Pedido {
	
	private int id;
	private String[] items = {"camisa","calça","lençol" } ;
	private String[] serviAdicional = {"passar", "dobrar"};
	private String[] status = {"pendente", "em processo", "entregue"};
	
	
	//muitos pedidos vem de um cliente
	private Cliente cliente;
	
	//Representa um pedido feito por um cliente, contendo informações como os itens a serem lavados 
	//(por exemplo, camisas, calças, lençóis), os serviços adicionais (por exemplo, passar, dobrar) e o 
	//status do pedido (por exemplo, pendente, em processo, entregue)
	
	public Pedido() {

	}

	public Pedido(String items[], String serviAdicional[], String[] status, Cliente cliente) {
		this.items = items;
		this.serviAdicional = serviAdicional;
		this.status = status;
		this.cliente = cliente;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public String[] getServiAdicional() {
		return serviAdicional;
	}

	public void setServiAdicional(String[] serviAdicional) {
		this.serviAdicional = serviAdicional;
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pedido [items=" + Arrays.toString(items) + ", serviAdicional=" + Arrays.toString(serviAdicional)
				+ ", status=" + Arrays.toString(status) + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
}
