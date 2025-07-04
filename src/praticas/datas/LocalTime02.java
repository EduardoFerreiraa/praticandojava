package praticas.datas;

import java.time.LocalTime;

public class LocalTime02 {
	public static void main(String[] args) {
		// Cria um horário específico: 15 horaas, 30 minutos e 0 segundos
		LocalTime horario = LocalTime.of(15, 30, 59);
		System.out.println("Horário escolhido: " + horario);
	}
}
