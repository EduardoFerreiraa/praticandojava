package praticas.metodos;

public class Aluno {
	private String nome;
	private int idade;
	private double nota;
	
	public Aluno(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Nota: " +nota);
	}
	
	public boolean aprovado() {
		boolean status = nota >= 6;
		System.out.println("Você foi: " + (status ? " Aprovado!" : "Reprovado!"));
		return status;
	}
	
	public void atualizarNota(double novaNota) {
		nota += novaNota;
		System.out.println("Nota atualizada: " +nota);
	}
}
