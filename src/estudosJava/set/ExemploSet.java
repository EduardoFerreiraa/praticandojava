package estudosJava.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> frutas = new HashSet<>();
		
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Laranja");
		frutas.add("Maçã");
		
		System.out.println(frutas);
		
	}
}
