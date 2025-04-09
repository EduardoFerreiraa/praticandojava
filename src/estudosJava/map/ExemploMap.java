package estudosJava.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		Map<String, String> capitais = new HashMap<>();
		
		capitais.put("Brasil", "Brasília");
		capitais.put("França", "Paris");
		capitais.put("Japão", "Tóquio");
		capitais.put("Brasil", "Nova Brasília");
		
		System.out.println("Mapa de capitais: " + capitais);
		System.out.println("capital do Japão: " + capitais.get("Japão"));
		
		capitais.remove("França");
		System.out.println("Após remover França: " + capitais);
	}
}
