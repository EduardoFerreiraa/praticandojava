package praticandojava.Poo.Heranca;

public class Veiculo {
	private String nome;
	private String modelo;
	private String valor;
	private int ano;
	
	public Veiculo(String nome, String modelo, int ano, String valor) {
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}
	
	public void Imprimir() {
		System.out.println(getNome());
		System.out.println(getModelo());
		System.out.println(getAno());
		System.out.println(getValor());
		System.out.println("================");
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
