package estudosJava.optional;

import java.util.Optional;

public class ExemploOptional {
	public static void main(String[] args) {
		String nomeRecebido = null;
		
		Optional<String> nome = Optional.ofNullable(nomeRecebido);
		
		if(nome.isPresent()) {
			System.out.println("Nome recebido: " + nome.get().toUpperCase());
		} else {
			System.out.println("Nenhum nome foi informado.");
		}
		
		String nomeFinal = nome.orElse("Visitante");
		System.out.println("Olá, " + nomeFinal);
		
		Optional<String> nomeComSobrenome = nome.map(n -> n + " Ferreira");
		
		nomeComSobrenome.ifPresent(n -> System.out.println("Nome completo: " + n));
	}
}
