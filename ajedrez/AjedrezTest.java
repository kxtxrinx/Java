package ajedrez;

import java.util.Scanner;

public class AjedrezTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] ajedrez = new int[8][8];
		String alfil;
		
		System.out.println();
		//Para mostrar las letras se hace con un bucle de char
		System.out.print("  ");
		for (char letra='a';letra<='h';letra++) {
		    System.out.print(letra + " ");
		}
		
		System.out.println();
		for (int i=1;i<=8;i++) {
		    System.out.print(i + " ");
		    for (int j=0;j<ajedrez.length;j++) {
		        System.out.print(ajedrez[i-1][j] + " ");
		    }
		    System.out.println();
		}
		
		do {
		System.out.println("Introduzca la posición del alfil:");
		alfil = s.nextLine();
		}while (!alfil.matches("[a-h][1-8]"));

		//Separar la letra del número
		String[]posAlfil = alfil.split("");
		
	    // Obtener la posición del alfil
	    int fila = Integer.parseInt(posAlfil[1]) - 1;
	    //Restar el valor ascii de la letra introducida al de 'a' para conseguir la columna
	    int columna = posAlfil[0].charAt(0) - 'a';
		
		Ajedrez.moverAlfil(ajedrez,fila,columna);
	}

}
