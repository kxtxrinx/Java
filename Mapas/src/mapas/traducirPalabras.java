package mapas;

import java.util.HashMap;
import java.util.Scanner;

public class traducirPalabras {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, String> traduccion = new HashMap<>();
		traduccion.put("Besides","Además");
		traduccion.put("However", "De cualquier forma...");
		traduccion.put("Further", "Fomentar");
		traduccion.put("Crawl", "Arrastrarse");
		traduccion.put("test", "prueba");
		System.out.println("¿Qué palabra quieres traducir?");
		String palabra=s.nextLine();
		
		System.out.println(traduccion.keySet());
		
				//traduccion.get(palabra);
				//System.out.println(palabra + " = " + traduccion.getOrDefault(palabra,"Palabra no encontrada"));
		
	}

}
