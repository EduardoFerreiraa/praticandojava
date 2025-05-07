package praticas.exercicios.avaliacaoAlunos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
		double media = aluno.calcularMedia();
		
		System.out.println("Média: " +media);
		
		if(aluno.foiAprovado()) {
			System.out.println("Situação: Aprovado!");
		} else {
			System.out.println("Situação: Reprovado!");
		}
		
		scanner.close();
	}
}
