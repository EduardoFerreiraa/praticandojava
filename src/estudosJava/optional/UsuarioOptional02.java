package estudosJava.optional;

import java.util.Optional;

public class UsuarioOptional02 {
	public static void main(String[] args) {
		
		String usuario = null;
		Optional<String> nome = Optional.ofNullable(usuario);
		
		if(nome.isPresent()) {
			System.out.println("Valor presente no Optional: " +nome.get());
		} else {
			System.out.println("Valor não está presente (valor nulo).");
		}
		
		String nomeFinal = nome.orElse("Usuário desconhecido");
		System.out.println("Nome final: " + nomeFinal);
		
		Optional<String> nomeFormatado = nome.map(n -> n.toUpperCase() + " - Perfil ativo");
		nomeFormatado.ifPresent(n -> System.out.println("Nome formatado: " + n));
	}
}
