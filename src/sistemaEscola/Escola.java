package sistemaEscola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	
	private List<Professor> professor;
	private List<Aluno> aluno;
	
	public Escola() { 
		this.professor = new ArrayList<>();
		this.aluno = new ArrayList<>();
	}
	
	
	
	
	public List<Professor> getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor.add(professor);
	}

	public List<Aluno> getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno.add(aluno);
	}
	
	
	public void verAluno() {
		for (Aluno a1 : aluno) {
			System.out.println(a1.getNome()+ ", possui: " + a1.getIdade() + ", anos" + ". Seu numero de matricula é: "+ a1.getMatricula());
		}
	}
	
	public void verProfessor() {
		for(Professor p1: professor) {
			System.out.println(p1.getNome()+ ", possui: "+ p1.getIdade() + ", anos "+ ". Ele(a) leciona na disciplina: "
		+p1.getDisciplina()+ ". E a principal diferença dele(a) para o aluno e seu salario que é: "+ p1.getSalario()+ " R$");
		}
	}
	
	
}
