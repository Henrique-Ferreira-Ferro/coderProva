package nasa;

public class MissaoEspacial {
	
	Tripulante tripulante = new Tripulante();
	
	NaveEspacial nave = new NaveEspacial();
	
	BaseControle base =  new BaseControle();
	
	
	public void adicionaTripulanteNave(NaveEspacial nave, Tripulante tripulante) {
		System.out.println("Adicionando os tripulante a nave "+ nave.getNome());
		nave.setTripulates(tripulante);
		
	}
	
	public void atualizaStatus(NaveEspacial nave) {
		this.nave.setStatus(nave.getStatus());
	}
	
	//"em orbita","em solo","em manutenção"
	
	public void exibiMissao(NaveEspacial nave, BaseControle base ) {
		
		String status = null;
		for(String andamento: nave.getStatus()) {
			if(andamento.equals("em orbita")) {
				status = andamento;
			}else if(andamento.equals("em solo")) {
				status = andamento;
			}else if(andamento.equals("em manutenção")) {
				status = andamento;
			}
		}
		
		
		
		System.out.println("--------------------------");
		System.out.println("Informações sobre a missão!");
		System.out.println();
		System.out.println("A nave "+ nave.getNome()+ " está atualmente em: "+ 
		status + ". Por sua vez possui os seguintes tripulantes: ");
		System.out.println("");
		for(Tripulante trip : nave.getTripulantes()) {
			System.out.println("  " + trip.getNome());
		}
		
		System.out.println();
		System.out.println(base.exibiBase());
		
		System.out.println("--------------------------");
	}
	
}
