package estudosJava.enums;

public class Main {
	public static void main(String[] args) {
		DiadaSemana hoje = DiadaSemana.SABADO;
		
		System.out.println("Hoje é: " +hoje);
		
		if(hoje == DiadaSemana.SABADO || hoje == DiadaSemana.DOMINGO) {
			System.out.println("É fim de semana!");
		} else {
			System.out.println("É dia útil.");
		}
	}
}
