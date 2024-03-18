package controleLavand;

public class Recibo {

	
	public Recibo() {
		
	}
	
	
	public void geraRecibo(Pedido pedido,ServicoLavanderia servico) {
		System.out.println("---------------------------------");
		
		for(String itens: pedido.getItems()) {
			System.out.println("Itens passados: " + itens);
		}
		
		for(String serv: pedido.getServiAdicional()) {
			System.out.println("Serviços solicitados: " + serv);
		}
		
		
		servico.calcServico(pedido);
	}
	
}
