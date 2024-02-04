package prova;

import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------- É primo? --------");
		
		
		System.out.print("Digite um numero para sabermos se é primo ou não: ");
		int num = entrada.nextInt();
		
		if(ePrimo(num) == true) {
			System.out.println("O numero é primo ^^");
		}else {
			System.out.println("O numero não é primo :)");
		}
		
		
		entrada.close();
	}
	
	private static boolean ePrimo(int num) {
		if(num <= 1) 
			return false;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
