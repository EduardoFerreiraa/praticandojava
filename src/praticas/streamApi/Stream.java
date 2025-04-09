package praticas.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Eduardo", "Gustavo", "Lorrayne", "Eduarda");
				
		List<String> nomesFiltrados = nomes.stream()
				.filter(nome -> nome.startsWith("E"))
				.collect(Collectors.toList());
		
		System.out.println(nomesFiltrados);
	}
}
