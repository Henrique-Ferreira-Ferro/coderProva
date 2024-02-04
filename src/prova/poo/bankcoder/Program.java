package prova.poo.bankcoder;

public class Program {
	public static void main(String[] args) {
		
		Account c1 = new Account(123, 1234.32,"Pedro Ferro");
		
		
		c1.depositar(324.12);
		c1.retirar(1243);
		
		System.out.printf("O cliente: "+ c1.getTitular() + " tem: %.2f \n", c1.getSaldo());
		
		Account c2 = new Account(423, 4534.32,"Icaro Ferro");

		c2.depositar(454.12);
		c2.retirar(1243);
		
		System.out.printf("O cliente: "+ c2.getTitular() + " tem: %.2f \n", c2.getSaldo());

		
		Bank banco = new Bank();
		
		banco.abrirConta("João");
		banco.abrirConta("Paulo");
		
		System.out.println(banco.trasContas(1));
		System.out.println(banco.trasContas(2));
		
		banco.daDinheiro(1, 234.02);
		System.out.println(banco.trasContas(-23));
	}
}
