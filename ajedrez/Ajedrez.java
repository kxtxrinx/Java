package ajedrez;

public class Ajedrez {
	
	public static void moverAlfil(int[][]ajedrez, int fila, int columna) {
		System.out.println("El alfil puede moverse a las siguientes posiciones:");
		for (int i=0;i<ajedrez.length;i++) {
		    for (int j=0;j<ajedrez[0].length;j++) {
		        int moverFila = Math.abs(fila - i);
		        int moverColumna = Math.abs(columna - j);
		        if (moverFila == moverColumna && moverFila != 0) {
		            char letraColumna = (char)('a' + j);
		            char letraFila = (char)('1' + i);
		            System.out.print(letraColumna + "" + letraFila + " ");
		        }
		    }
	    }
	}
}
