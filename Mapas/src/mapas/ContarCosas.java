package mapas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContarCosas {
	
	public void contarVocales(String palabra) {
		int[] vocales = new int[5]; //en lugar de crear un contador para cada vocal
		palabra = palabra.toLowerCase();
		
		for(int i=0;i<palabra.length();i++) {
			switch(palabra.charAt(i)) {
				case 'a':
				case 'á':
					vocales[0]++;
					break;
				case 'e':
				case 'é':
					vocales[1]++;
					break;
				case 'i':
				case 'í':
					vocales[2]++;
					break;
				case 'o':
				case 'ó':
					vocales[3]++;
					break;
				case 'u':
				case 'ú':
					vocales[4]++;
					break;
				}
		}
		/*
		char[] letrasVocales = new char[20];
		vocales[0]='a';
		vocales[1]='e';
		vocales[2]='i';
		vocales[3]='o';
		vocales[4]='u';
		*/
		
		System.out.println(Arrays.toString(vocales));
		
	}
		/* Mi manera.
		String palabra = "Test";
		char[] arrayPalabra = palabra.toCharArray();

		int contVocales=0;
		for(int i=0;i<vocales.length;i++){
			for(int j=0;j<arrayPalabra.length;j++) {
				if (arrayPalabra[i]==vocales[i]) {
					contVocales++;
				}
			}
		}*/
	
	public void contarPalabras(String frase) {
		Map<String,Integer> contador = new HashMap<>(); //Palabra, cuántas veces aparecen
		int repeticiones;
		for(String palabra: frase.split(" ")) {
			repeticiones = 0;
			if(contador.containsKey(palabra)) {
				repeticiones = contador.get(palabra);
			}
			repeticiones++;
			contador.put(palabra, repeticiones); //la clave nunca está repetida en un mapa
		}
		System.out.println(contador);
	}

	public void contarPalabras2(String frase) {
		//Primera forma
		System.out.println("Primera forma:");
		Map<String, Integer> contador2 = new HashMap<>();
		int repeticiones;
		for(String palabra: frase.split("")) {
			repeticiones = contador2.getOrDefault(palabra, 0);
			contador2.put(palabra,repeticiones);
			
		}
		System.out.println(contador2);
		
		
		//Segunda forma 
		System.out.println("Segunda forma:");
		for(Map.Entry<String, Integer> pareja: contador2.entrySet()) {
			System.out.println(pareja.getKey() + "-->" + pareja.getValue());
		}
		
		//Tercera forma
		System.out.println("Tercera forma:");
		for(String clave: contador2.keySet()) {
			System.out.println(clave + "--> " + contador2.get(clave));
		}
	}
	
	public static void main(String[]args) {
		new ContarCosas().contarPalabras("Im gonna gonna gon k k k ll");
		
		
		
	}
}
