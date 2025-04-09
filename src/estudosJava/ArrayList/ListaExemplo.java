package estudosJava.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListaExemplo {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Ana");
		nomes.add("Eduardo");
		nomes.add("Maria");
		
		System.out.println("Lista de nomes: " +nomes);
		
		nomes.remove("Eduardo");
		System.out.println("Após remover o Eduardo: " +nomes);
		
		System.out.println("Primeiro nome: " + nomes.get(0));
	}
}
