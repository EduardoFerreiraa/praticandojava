package praticas.optional;

import java.util.Optional;

public class Optional03 {
	public static void main(String[] args) {
		
		Integer idade = 18;
		Optional<Integer> idadeOptional = Optional.ofNullable(idade);
		
		if(idadeOptional.isPresent()) {
			System.out.println("Idade informada: " +idadeOptional.get());
		} else {
			System.out.println("Idade não informada");
		}
		
		int idadeFinal = idadeOptional.orElse(0);
		System.out.println("Idade final: " +idadeFinal);
		
		Optional<String> mensagem = idadeOptional.map(n -> "Idade convertida: " + n + " anos");
		mensagem.ifPresent(System.out::println);
	}
}	
