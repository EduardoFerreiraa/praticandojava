package estudosJava.polimorfismo;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		animal.emitirSom();
		cachorro.emitirSom();
		gato.emitirSom();
		
	}
}
