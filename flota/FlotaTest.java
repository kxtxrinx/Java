package flota;

import java.util.Scanner;

public class FlotaTest {


	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		String[][]flota = new String[10][10];
		
		int balas = 20;
		int[] num = new int[10];
		
		//Posición aleatoria de la matriz
		int fila = (int)(Math.random()*10);
		int column = (int)(Math.random()*(8-0)); //Para no salirse de la flota
		
		for(int i=0;i<flota.length;i++) {
			for(int j=0;j<flota.length;j++) {
			flota[i][j] = "0";
			}
		}
		
		flota[fila][column] = "-";
		flota[fila][column+1] = "-";
		flota[fila][column+2] = "-";
		
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		int targetFila;
		int targetCol;
		boolean win = false;
		
		/*para probar viendo la flota antes
		System.out.print("  ");
		for(int c:num) {
			System.out.print(c+ " ");
		}
		
		System.out.println();
		for (int i=1; i<=10; i++) {
		    System.out.print(i + " ");
		    for (int j=0; j<10; j++) {
		        System.out.print(flota[i-1][j] + " ");
		    }
		    System.out.println();
		}*/
		
		do {
			for(int i=0;i<balas && win==false;i++) {
				do {
				System.out.println("¿A qué fila quieres disparar con tu " + balas + "º bala? Recuerda introducir la fila 10 como máximo.");
				targetFila = s.nextInt();
				}while(targetFila>10 || targetFila<1);
				targetFila-=1;
				do {
				System.out.println("¿Y columna? (El máximo es también 10).");
				targetCol = s.nextInt();
				}while(targetCol>10 || targetCol<1);
				targetCol-=1;
				if(flota[targetFila][targetCol].equals("-")) {
					System.out.println("Lograste hundir el barco, ¡enhorabuena!");
					win = true;
				}else {
					balas--;
				}
			}
		}while(win==false && balas>0);
		
		if(win==false) {
			Flota.derrota(flota, num);
		}
	}
}
