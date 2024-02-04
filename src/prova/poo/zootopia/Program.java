package prova.poo.zootopia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	private static List<Animal> animais = new ArrayList<>();
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("-----------BEM VINDO-----------");
		System.out.println("Vamos montar um zoologico?");
		System.out.println("\n");
		System.out.print("Quantos animais teremos? ");
		int quant = entrada.nextInt();
		
		for(int i = 0; i < quant; i++) {
			System.out.print("Digite o nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.print("Qual é a especie dele? ");
			String especie = entrada.nextLine();
			System.out.print("Qual a idade dele? ");
			int idade = entrada.nextInt();
			Animal ani1 = new Animal(nome,especie,idade);
			animais.add(ani1);
			System.out.println();
		}
		
		Cage ca1 = new Cage(1, 3);
		
		for(Animal animal: animais) {
			ca1.adicionar_bichinhos(animal);
		}
		System.out.print("Qual será o nome do zoologico? ");
		entrada.nextLine();
		String nome = entrada.nextLine();
		
		Zoo zoologico = new Zoo(nome);
		zoologico.adicionaGaiola(ca1);
		zoologico.exibirInfo();
		
		entrada.close();
	}
}
