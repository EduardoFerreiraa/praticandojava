package praticas.metodos.teste;

import praticas.metodos.Aluno;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Eduardo", 18, 6);
		
		aluno.exibirInformacoes();
		aluno.aprovado();
		aluno.atualizarNota(3);
	}
}
