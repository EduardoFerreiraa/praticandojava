package estudosJava.agregacaoeComposicao.agregacao;

public class teste {
	public static void main(String[] args) {
		Professor professor = new Professor("Eduardo");
		Aluno aluno1 = new Aluno("Giovanna", professor);
		
		aluno1.MostrarDados();
		aluno1 = null;
		
		System.out.println("Professor ainda existe: " + professor.getNome());
	}
}
