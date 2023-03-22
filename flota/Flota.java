package flota;

public class Flota {

	
	public static void derrota(String[][]flota, int[] num) {
		System.out.println("Ohh, ¡qué pena! El barco estaba en:");
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
		}
	}
}
