package prova;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		/*
		 * TODO:
		 * 1. Calculadora Simples:
   		 * - Crie uma classe "Calculator" com métodos para adição, subtração, multiplicação e divisão.
   	     * - Permita que o usuário insira dois números e escolha a operação desejada.
		 * 
		 */
		
	
		System.out.println("----------Calculadora----------");
		
		Scanner entrada = new Scanner(System.in);	
		System.out.print("Digite a operação que será usada: ");
		String digitada = entrada.nextLine();
		
		System.out.print("Digite o primeiro valor: " );
		double num1 = entrada.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		
		
		
		switch (digitada) {
		case "+": 
			System.out.printf("A soma é: %.2f", (num1 + num2));
			break;
		case "-":
			System.out.printf("A subtração é: %.2f", (num1 - num2));
			break;
		case "*":
			System.out.printf("A multiplicação é: %.2f", (num1 * num2));
			break;
		case "/":
			System.out.printf("A divisão é: %.2f", (num1 / num2));
			break;
		default:
			System.out.println("Digite uma operação valida!!!");
			break;
		}
		
		
		entrada.close();
		
	}
}
