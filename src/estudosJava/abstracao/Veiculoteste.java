package estudosJava.abstracao;

public class Veiculoteste {
	public static void main(String[] args) {
		Carro carro = new Carro("Civic", "Honda", 2018);
		Moto moto = new Moto("Honda CB 500X", "Honda", 2023);
		
		carro.imprimir();
		System.out.println("===================");
		moto.imprimir();
		
		System.out.println("===================");
		carro.ligar();
		carro.desligar();
		System.out.println("===================");
		moto.ligar();
		moto.desligar();
	}
}
