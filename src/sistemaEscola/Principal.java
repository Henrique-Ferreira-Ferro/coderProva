package sistemaEscola;

public class Principal {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("João de Jesus");
		a1.setIdade(10);
		a1.setMatricula("3123213");
		
		Aluno a2 = new Aluno();
		a2.setNome("Pedro Mascal");
		a2.setIdade(12);
		a2.setMatricula("55223213");
		
		
		Aluno a3 = new Aluno();
		a3.setNome("Willian F Ferro");
		a3.setIdade(19);
		a3.setMatricula("4242123213");
		
		Aluno a4 = new Aluno();
		a4.setNome("Luana Almeida");
		a4.setIdade(9);
		a4.setMatricula("423123213");
		
		
		Professor p1 = new Professor();
		p1.setNome("Guilherme Albuquerque");
		p1.setIdade(24);
		p1.setDisciplina("Fisica");
		p1.setSalario(33330.4);
		
		Professor p2 = new Professor();
		p2.setNome("Laura Gabrielle");
		p2.setIdade(19);
		p2.setDisciplina("Português");
		p2.setSalario(5330.4);
		
		Escola e1 = new Escola();
		
		e1.setAluno(a1);
		e1.setAluno(a2);
		e1.setAluno(a3);
		e1.setAluno(a4);

		e1.setProfessor(p1);
		e1.setProfessor(p2);
		
		e1.verAluno();
		
		System.out.println("-----------------------------------------------");
		
		e1.verProfessor();
		
		
	}
}
