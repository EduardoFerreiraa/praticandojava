package praticas.optional;

import java.util.Optional;

public class Optional01 {
	public static void main(String[] args) {
		
		String nomeUsuario = "Eduardo";
		
		Optional<String> nome = Optional.ofNullable(nomeUsuario);
		
		if(nome.isPresent()) {
			System.out.println("Valor presente: " +nome.get());
		} else {
			System.out.println("Valor não está presente.");
		}
		
		String nomeFinal = nome.orElse("Usuário desconhecido");
		System.out.println("Nome final: " +nomeFinal);
		
		Optional<String> nomeFormatado = nome.map(n -> n.toUpperCase() + " - Perfil ativo");
		nomeFormatado.ifPresent(n -> System.out.println("Nome formatado: " + n));
	}
}
