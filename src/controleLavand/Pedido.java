package controleLavand;

public class Pedido {
	
	private int id;
	private String items;
	private String serviAdicional;
	private String[] status;
	
	//muitos pedidos vem de um cliente
	private Cliente cliente;
	
	public Pedido() {
		
	}

	public Pedido(String items, String serviAdicional, String[] status, Cliente cliente) {
		this.items = items;
		this.serviAdicional = serviAdicional;
		this.status = status;
		this.cliente = cliente;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getServiAdicional() {
		return serviAdicional;
	}

	public void setServiAdicional(String serviAdicional) {
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
	
	
	
	
	
}
