package praticas.datas;

import java.time.LocalTime;

public class LocalTime03 {
	public static void main(String[] args) {
		LocalTime agora = LocalTime.now();
		
		// Adiciona 2 horas ao horário atual
		LocalTime maisDuasHoras = agora.plusHours(2);
		System.out.println("Mais duas horas: " + maisDuasHoras);
		
		// Subtrai 15 minutos do horário atual
		LocalTime menosQuinzeMin = agora.minusMinutes(15);
		System.out.println("15 minutos atrás: " + menosQuinzeMin);
	}
}
