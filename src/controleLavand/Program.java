package controleLavand;

public class Program {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("jose","Rua das Granadas",223124,"jose@gmail.com");
		
		
		//String items[], String serviAdicional[], String[] status, Cliente cliente
		
		String[] items = {"camiseta"};
		String[] servi = {"passar"};
		String[] status = {"em processo"};
		
		Pedido p1 = new Pedido(items,servi,status,c1);

		
		ServicoLavanderia servico = new ServicoLavanderia();
		servico.calcServico(p1);
		
		Recibo recibo = new Recibo();
		
		recibo.geraRecibo(p1,servico);
		
		
		
	}
}
