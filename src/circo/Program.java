package circo;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		
		
		int idade = 0;
		
		JOptionPane.showMessageDialog(null, "Olá seja muito bem vindo!!", "Informação", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Para entrar no circo da CodePlus, precisamos saber sua idade :D  !!!!!", "Informação", JOptionPane.INFORMATION_MESSAGE);
		String convert = JOptionPane.showInputDialog("Digite sua idade: ");

		while(convert.matches("[a-z]*") || convert.matches("[A-Z]*")) {
			convert = JOptionPane.showInputDialog("Digite sua idade: ");
		}
		try {
			idade = Integer.parseInt(convert);
			
				if(idade < 5) {
					JOptionPane.showMessageDialog(null, "É de graça chefe ^^", "Informação", JOptionPane.INFORMATION_MESSAGE);
				}else if(idade >= 5 && idade <= 12) {
					JOptionPane.showMessageDialog(null, "Vai ter que pagar 20 reais :|", "Informação", JOptionPane.INFORMATION_MESSAGE);
				}else if(idade > 12){
					JOptionPane.showMessageDialog(null, "Vai ter que pagar 30 reais :(", "Informação", JOptionPane.INFORMATION_MESSAGE);
				}
			
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Não insira caracteres especiais ou letras", "Atenção", JOptionPane.ERROR_MESSAGE);

		}
		
		
	}
}
