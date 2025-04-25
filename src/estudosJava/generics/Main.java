package estudosJava.generics;

public class Main {
	public static void main(String[] args) {
		
        // Criando uma caixa para String
		Caixa<String> caixaDeString = new Caixa<>();
		caixaDeString.colocar("Mensagem");
		System.out.println("Caixa de String: " + caixaDeString.pegar());
		
        // Criando uma caixa para Inteiro
		Caixa<Integer> caixaDeInteger = new Caixa<>();
		caixaDeInteger.colocar(100);
		System.out.println("Caixa de inteiros: " +caixaDeInteger.pegar());
	}
}
