package praticas.sistemaCadastro.model;

public class Usuario {
	private String nome;
	private String email;
	private int idade;
	
	public Usuario(String name, String email, int idade) {
		this.nome = name;
		this.email = email;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String exibir() {
		return "Nome: " + nome + " | Email: " + email + " | Idade: " + idade;
	}
}
