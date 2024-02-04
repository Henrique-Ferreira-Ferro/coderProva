package prova.poo.bankcoder;

public class Account {

	private int numConta;
	private Double saldo;
	private String titular;
	
	public Account() {
		
	}

	public Account(int numConta, String titular) {
		super();
		this.numConta = numConta;
		this.saldo = 0.0;
		this.titular = titular;
	}
	
	public Account(int numConta, Double saldo, String titular) {
		super();
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	// Métodos da conta:
	
	
	public void depositar(double dinheiro) {
		saldo += dinheiro;
	}
	
	
	public boolean retirar(double dinheiro) {
		if(saldo >= dinheiro) {
			saldo -= dinheiro;
			return true;
		}else {
			System.out.println("Saldo insuficiente :(");
			return false;
		}
	}

	@Override
	public String toString() {
		return "O Titular da conta é: "+ this.getTitular()+ ", esse por sua vez possui saldo de: " + this.getSaldo() +". Seu numero é: "+ this.getNumConta()+"";
	}
	

	
	
}
