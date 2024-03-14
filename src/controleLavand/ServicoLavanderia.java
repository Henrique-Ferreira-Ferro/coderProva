package controleLavand;

public class ServicoLavanderia {
	
	Pedido pedido = new Pedido();
	
	public Double calcServico() {
		if(pedido.getItems().equals("camisa") || pedido.getItems().equals("calça")){
			
			return 20.00;
			
		}else if(pedido.getItems().equals("camisa") || pedido.getItems().equals("calça")  && pedido.getServiAdicional().equals("passar")) {
			return 50.00;
		}else if(pedido.getServiAdicional().equals("dobrar")) {
			return 50.00;
		}else {
			return 0.0;
		}
	}
	
}
