package sistemaEscola;

public class Aluno extends Pessoa{
	
	private String matricula;
	
	public Aluno() {
		
	}

	public Aluno(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
