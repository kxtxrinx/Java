package ejercicio4;

import java.util.*;

public class ArrayDinamico4 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		List<String> palabras = new ArrayList<>();
		
		System.out.println("Introduce 10 palabras.");
		for(int i=0;i<10;i++) {
			palabras.add(s.nextLine());
			
		}
		Collections.sort(palabras);
		
		for(String c:palabras) {
			System.out.println(c);
		}

	}

}
