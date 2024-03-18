package controleLavand;

public class ServicoLavanderia {
	
	
	//ServicoLavanderia: Esta classe deve conter métodos para calcular o custo de lavagem com base nos itens e serviços solicitados.

	
	//Representa um pedido feito por um cliente, contendo informações como os itens a serem lavados 
		//(por exemplo, camisas, calças, lençóis), os serviços adicionais (por exemplo, passar, dobrar) e o 
		//status do pedido (por exemplo, pendente, em processo, entregue)
	
	private Double total = 0.0;
	
	public void calcServico(Pedido pedido) {
		
		double precoItem = 0.0;
		
		for(String item: pedido.getItems()) {
			if(item.equals("camiseta") || item.equals("calça")) {
				
				precoItem = 20.00;
			}else if(item.equals("lençol")) {
				precoItem = 25.00;
			}
		}
			
		
		
		
		double precoServico = 0.0;
		
		for(String servico: pedido.getServiAdicional()) {
			if(servico.equals("passar")) {
				precoServico = 30.00;
			}else if(servico.equals("dobrar")) {
				precoServico = 15.00;
			}
		}
		
		
		//status = {"pendente", "em processo", "entregue"};
		String andamento = null;
		for(String status: pedido.getStatus()) {
			if(status.equals("pendente")) {
				andamento = status;
			}else if(status.equals("em processo")) {
				andamento = status;
			}else if(status.equals("entregue")) {
				andamento = status;
			}
		}
		
		
		double custoTotal = precoItem + precoServico;
		total += custoTotal;
		System.out.println("Status: " + andamento);
		System.out.println("Custo do serviço: "+ custoTotal);
		System.out.println("Total acumulado: "+ total);
	}

	
}
