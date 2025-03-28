package estudosJava.agregacaoeComposicao.agregacao;

public class Aluno {
	private String nome;
	private Professor professor;
	
	public Aluno(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}
	
	public void MostrarDados() {
		System.out.println("Aluno: " +nome);
		System.out.println("Professor: " + professor.getNome());
	}
}
