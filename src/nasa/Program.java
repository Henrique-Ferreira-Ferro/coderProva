package nasa;

public class Program {
	public static void main(String[] args) {
		
		
		
		String[] status1 = {"em orbita"};
		//String nome, String[] status
		NaveEspacial n1 = new NaveEspacial("Apollo", status1);
		
		
		//String nome, int idade, String[] funcao
		String[] funcao1 = {"piloto"};
		Tripulante t1 = new Tripulante("Buzz D Ferro",39,funcao1);
		String[] funcao2 = {"engenheiro"};
		Tripulante t2 = new Tripulante("Neo F Alon",25,funcao2);
		Tripulante t3 = new Tripulante("Jesse Pinkman",29,funcao2);
		
		//String nome, String localizacao, String responsavel
		
		BaseControle b1 = new BaseControle("Acropolis","Golfo do Mexico", "Walter White");
		
		MissaoEspacial missao1 = new MissaoEspacial();
		
		missao1.adicionaTripulanteNave(n1, t1);
		missao1.adicionaTripulanteNave(n1, t2);
		missao1.adicionaTripulanteNave(n1, t3);
		
		missao1.atualizaStatus(n1);
		
		missao1.exibiMissao(n1, b1);
		
		
		
	}
}
