package estudosJava.generics;

//Classe genérica
public class Caixa<T> {
	private T valor;
	
    // Método para colocar um valor na caixa
	public void colocar(T valor) {
		this.valor = valor;
	}
	
    // Método para pegar o valor da caixa
	public T pegar() {
		return valor;
	}
}
