package calcMedia;

public class NotasAluno {
	
	private int quantidadeNotas;
    private double somaNotas;

    public NotasAluno() {
        this.quantidadeNotas = 0;
        this.somaNotas = 0.0;
    }

    public void adicionarNota(double nota) {
        somaNotas += nota;
        quantidadeNotas++;
    }

    public double calcularMedia() {
        if (quantidadeNotas == 0) {
            return 0.0; 
        }
        return somaNotas / quantidadeNotas;
    }

	
	
}
