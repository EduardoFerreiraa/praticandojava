package praticas.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Eduardo", "Lorrayne", "Gustavo");
		
		List<String> nomesFiltrados = nomes.stream()
				.filter(nome -> nome.length() > 4)
				.map(nome -> nome.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(nomesFiltrados);
	}
}
