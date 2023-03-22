package ejercicio3;

import java.util.*;

public class ArrayDinamico3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		
		System.out.println("Introduce 10 números:");
		for(int i=0;i<10;i++) {
			numeros.add(s.nextInt());
		}
		
		Collections.sort(numeros);
		
		for(int c:numeros) {
			System.out.println(c);
		}
		
	}

}
