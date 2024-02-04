package prova.poo.bankcoder;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Account> clientes = new ArrayList<>();
	
	public Bank() {
		
	}
	
	public void abrirConta(String client) {
		int clientNum = clientes.size() + 1;
		Account novaConta = new Account(clientNum, client);
		clientes.add(novaConta);
		System.out.println("Uma nova conta foi criada. O numero da conta é: "+ novaConta.getNumConta());
	}
	
	public Account trasContas(int numConta) {
		for(Account contas : clientes) {
			if(contas.getNumConta() == numConta) {
				return contas;
			}
		}
		System.out.println("Desculpa, a conta não foi encontrada");
		return null;
	}
	
	public void daDinheiro(int numConta, double dinheiro) {
	    if (numConta > 0 && numConta <= clientes.size()) {
	        clientes.get(numConta - 1).depositar(dinheiro);
	    } else {
	        System.out.println("Conta não encontrada ou inválida");
	    }
	}

	
	
}
