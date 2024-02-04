package prova.poo.alunos;

public class Student {
	private String nome;
	private int idade ;
	private Double nota;
	
	public Student() {
		
	}

	public Student(String nome, int idade, Double nota) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "The name of student is: " + nome + ", his age: " + idade + ", student grade: " + nota + " ";
	}
	
	
	
}
