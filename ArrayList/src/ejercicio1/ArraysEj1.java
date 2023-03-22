package ejercicio1;

import java.util.*;

public class ArraysEj1 {
	public static void main(String[]args) {
		List<String> companeros = new ArrayList<String>();
		companeros.add("Lorena");
		companeros.add("Laura");
		companeros.add("Carlos");
		companeros.add("Sergio");
		companeros.add("Jaime");
		
		for(String c: companeros) {
			System.out.println(c);
		}
	}
}
