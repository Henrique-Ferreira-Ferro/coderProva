package nasa;

import java.util.ArrayList;
import java.util.List;

public class NaveEspacial {

	private String nome;
	private String[] status = {"em orbita","em solo","em manutenção"};
	
	
	
	private List<Tripulante> tripulantes = new ArrayList<>();

	public NaveEspacial() {
		
	}

	public NaveEspacial(String nome, String[] status) {
		super();
		this.nome = nome;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public List<Tripulante> getTripulantes() {
		return tripulantes;
	}
	
	public void setTripulates(Tripulante tripulante) {
		tripulantes.add(tripulante);
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}
	
	public void exibiNave() {
		System.out.println("O nome da nave é: "+ nome + " e possui: "+ tripulantes.size()+ 
				". O status atual da nave é: "+ status);
		
	}
	
	
	
}	
