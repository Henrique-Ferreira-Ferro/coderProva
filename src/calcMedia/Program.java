package calcMedia;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		NotasAluno aluno = new NotasAluno() ;
		
		System.out.print("Digite o numero de notas dos alunos: ");
		int quant = entrada.nextInt();

		for(int i = 0; i < quant; i ++) {
			System.out.print("Digite a nota numero: "+ (i+1)+ ": ");
			Double nota = entrada.nextDouble();
			aluno.adicionarNota(nota);

		}
		
		
		if(aluno.calcularMedia() > 7) {
			System.out.println("Aprovado com nota igual a: "+ aluno.calcularMedia());
		}else {
			System.out.println("Reprovado com nota igual a: "+ aluno.calcularMedia());
		}
		
		entrada.close();
		
	}
}
