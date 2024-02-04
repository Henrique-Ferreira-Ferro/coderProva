package prova;

import java.util.Scanner;

public class Forca {
	public static void main(String[] args) {
		
		/*TODO: 
		 * 3. Jogo da Forca:
   		 *	- Desenvolva uma versão simples do jogo da forca em Java.
   		 *	- Escolha uma palavra aleatória e permita que o usuário insira letras até adivinhar a palavra.
		 */
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "maça";
		char letra;
		boolean acertou = false;
		char[] letrasCorretas = new char[palavra.length()];
		int tentativas = 6;		
		char[] armazenadas = new char[tentativas];

			System.out.println("------ JOGO DA FORCA ------");

			for(int i = 0; i < tentativas; i++) {

				System.out.print("Digite uma letra: ");	
				letra = entrada.next().charAt(0);
				armazenadas[i] = letra;
				for(int j = 0; j < palavra.length(); j++) {
					if(palavra.charAt(j) == letra) {
						letrasCorretas[j] = letra;
					}	
				}
				if(String.valueOf(letrasCorretas).equals(palavra)) {
					acertou = true;
					break;
				}	
				
				
			}
			
			
			System.out.println("\n");
			
			if(acertou) {
				System.out.println("A palavra correta era: " + palavra);
				System.out.println("Parabéns você acertou!!!!");
			}else {
				System.out.println("A palavra correta era: " + palavra);
				System.out.println("Você digitou: "+ String.valueOf(armazenadas));
				System.out.println("Sentimos muito :(");
			}
			
		entrada.close();
	}
}
