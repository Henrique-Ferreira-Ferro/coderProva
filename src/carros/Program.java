package carros;

import javax.swing.JOptionPane;

public class Program {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Olá seja muito bem vindo!!", "Informação", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Vamos calcular o preço de revenda do seu carro baseado no seu ano de fabricação  !!!!!", "Informação", JOptionPane.INFORMATION_MESSAGE);
		String convert = JOptionPane.showInputDialog("Digite o ano fabricado: ");
		String num1 = JOptionPane.showInputDialog("Digite o preço do veiculo: ");
		
		
		while(convert.matches("[a-z]*") || convert.matches("[A-Z]*")) {
			convert = JOptionPane.showInputDialog("Digite o ano fabricado: ");
			num1 = JOptionPane.showInputDialog("Digite o preço do veiculo: ");
		}
		int ano = Integer.parseInt(convert);
		Double valor = Double.parseDouble(num1);
		Double result = 0.0;
		
		try {
			if(ano < 2000 ) {
				JOptionPane.showMessageDialog(null, "Tem desconto de 80% sobre o preço atual", "Informação", JOptionPane.INFORMATION_MESSAGE);
				 result = (valor - ((valor * 80) / 100)) ;
				JOptionPane.showMessageDialog(null, "O preço do seu veiculo vai ficar aproximadamente: " + result, "Informação", JOptionPane.INFORMATION_MESSAGE);
			}else if(ano >= 2000 && ano <= 2010) {
				JOptionPane.showMessageDialog(null, "Tem desconto de 60% sobre o preço atual", "Informação", JOptionPane.INFORMATION_MESSAGE);
				 result = (valor - ((valor * 60) / 100)) ;
					JOptionPane.showMessageDialog(null, "O preço do seu veiculo vai ficar aproximadamente: " + result, "Informação", JOptionPane.INFORMATION_MESSAGE);
			}else if(ano >= 2011 && ano <= 2020) {
				JOptionPane.showMessageDialog(null, "Tem desconto de 40% sobre o preço atual", "Informação", JOptionPane.INFORMATION_MESSAGE);
				 result = (valor - ((valor * 40) / 100)) ;
					JOptionPane.showMessageDialog(null, "O preço do seu veiculo vai ficar aproximadamente: " + result, "Informação", JOptionPane.INFORMATION_MESSAGE);
			}else if(ano > 2020) {
				JOptionPane.showMessageDialog(null, "Tem desconto de 20% sobre o preço atual", "Informação", JOptionPane.INFORMATION_MESSAGE);
				result = (valor - ((valor * 20) / 100)) ;
					JOptionPane.showMessageDialog(null, "O preço do seu veiculo vai ficar aproximadamente: " + result, "Informação", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Não insira caracteres especiais ou letras", "Atenção", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
