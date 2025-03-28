package estudosJava.agregacaoeComposicao.composicao;

public class Carro {
	private Motor motor;
	
	public Carro(int potenciaMotor) {
		this.motor = new Motor(potenciaMotor); 
	}
	
	public void ligarCarro() {
		System.out.println("Carro ligado!");
		motor.ligar();
	}
}
