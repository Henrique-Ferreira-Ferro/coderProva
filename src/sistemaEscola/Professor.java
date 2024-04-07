package sistemaEscola;

public class Professor extends Pessoa{
	
	private Double salario;
	private String disciplina;
	
	public Professor() {
		
	}

	public Professor(Double salario, String disciplina) {
		super();
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
}
