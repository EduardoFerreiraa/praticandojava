package praticas.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream02 {
	public static void main(String[] args) {
		List<String> frutas = Arrays.asList("Banana", "Maçâ", "Mamão");
		
		List<String> resultado = frutas.stream()
				.filter(nome -> nome.length() > 5)
				.map(nome -> nome.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(resultado);
	}
}
