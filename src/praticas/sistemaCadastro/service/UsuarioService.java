package praticas.sistemaCadastro.service;

import java.util.ArrayList;
import java.util.List;

import praticas.sistemaCadastro.model.Usuario;

public class UsuarioService {
	
	private List<Usuario> usuarios = new ArrayList<>();
	
	public void cadastrarUsuario(String nome, String email, int idade) {
		Usuario novousuario = new Usuario(nome, email, idade);
		usuarios.add(novousuario);
		System.out.println("Usuário cadastrado com sucesso!");
	}
	
	public void listarUsuarios() {
		if(usuarios.isEmpty()) {
			System.out.println("Nenhum usuário cadastrado");
		} else {
			System.out.println("Lista de usuários: ");
			for (Usuario u : usuarios) {
				System.out.println(u.exibir());
			}
		}
	}
}
