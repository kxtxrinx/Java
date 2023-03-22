package ejercicio2;

import java.util.*;

public class ArraysDinamicos2 {
	
	public static void main(String[]args) {
		int tamanio = (int)(Math.random()*11)+10;
		List<Integer> numeros = new ArrayList<>();
		int cantidadTotal=0;
		
		for(int i=0;i<tamanio;i++) {
			int random = (int)(Math.random()*100)+1;
			//numeros.set(i, random));
			numeros.add(random);
			cantidadTotal+=numeros.get(i);
		}
		
		System.out.println("El array tiene un tamaño de " + numeros.size());
		System.out.println("La suma total es de " + cantidadTotal + " y la media es de " + cantidadTotal/tamanio);
		
		int maximo = numeros.get(0);
		for(int i=0;i<numeros.size();i++) {
			if(numeros.get(i)>maximo) {
				maximo = numeros.get(i);
			}
		}
		
		System.out.println("Máximo: " + maximo);
		
		int minimo = numeros.get(0);
		for(int i=0;i<numeros.size();i++) {
			if(numeros.get(i)<minimo) {
				minimo=numeros.get(i);
			}
		}
		
		System.out.println("Mínimo: " + minimo);
		
	}

}
