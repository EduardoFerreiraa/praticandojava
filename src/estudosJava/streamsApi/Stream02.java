package estudosJava.streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream02 {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Eduardo", "Giovanna", "Leonardo", "Yasmim");
		
		List<String> nomesFiltrados = nomes.stream()
				.filter(nome -> nome.length()> 5)
				.map(nome -> nome.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(nomesFiltrados);
	}
}
