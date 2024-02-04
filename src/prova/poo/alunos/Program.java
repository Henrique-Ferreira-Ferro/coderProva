package prova.poo.alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	private static int quant = 0;
	private static List<Student> alunoList = new ArrayList<>();
	
	
	/*
	 *	4. Cadastro de Alunos:
   	 *- Crie uma classe "Student" com atributos como nome, idade e nota.
   	 *- Permita cadastrar alunos, exibir informações e calcular a média das notas.
	 * 
	 * Ixi acho que fiz errado :(
	 */
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Há quantos alunos? ");
		quant = entrada.nextInt();
		
		String nome = null;
		int idade = 0;
		Double nota = null;
		
		for(int i = 0; i < quant; i ++) {
			System.out.print("Digite o nome do aluno: ");
			entrada.nextLine();
			nome = entrada.nextLine();
			System.out.print("Digite a idade do aluno: ");
			idade = entrada.nextInt();
			System.out.print("Digite a nota do aluno: ");
			nota = entrada.nextDouble();
			System.out.println();
			Student alunos = new Student(nome,idade,nota);
			alunoList.add(alunos);
		}
		
		

		retornaAluno(alunoList);
		calculaMedia(alunoList);
		entrada.close();
	}
	
	public static void retornaAluno(List<Student> alunos) {
		
		for(Student aluno: alunos) {
			System.out.println("The name of student is: " + aluno.getNome() + ", his age: " + aluno.getIdade() + ", student grade: " + aluno.getNota() );
		}
		
	}
	
	public static void calculaMedia(List<Student> alunos) {
		Double total = 0.0;
		Double media = 0.0;
		for(Student aluno: alunos) {
			 total += aluno.getNota();
		}
		media = total / quant;
		System.out.println("A media da sala é: "+ media);

	}
	
	
}
