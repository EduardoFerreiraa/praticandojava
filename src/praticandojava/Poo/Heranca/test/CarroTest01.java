package praticandojava.Poo.Heranca.test;

import praticandojava.Poo.Heranca.Carro;

public class CarroTest01 {
	public static void main(String[] args) {
		Carro carro01 = new Carro("Toyoa", "Corolla", 2023, "R$120.000,00"); 
		Carro carro02 = new Carro("Ford", "Mustang GT", 2022, "R$500.000,00");
		Carro carro03 = new Carro("Volkswagen", "Gol", 2022, "R$70.000,00");
		
		carro01.Imprimir();
		carro02.Imprimir();
		carro03.Imprimir();
	}
}
