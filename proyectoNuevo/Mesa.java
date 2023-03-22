package proyectoNuevo;

public class Mesa {
	
	
	public static void mostrarMesas(String[][]texto, int[][]mesas) {
		for(int i=0;i<texto.length;i++) {
			System.out.print(texto[i][0]);
			for(int j=0;j<mesas[0].length;j++) {
				System.out.print(mesas[i][j] + " ");
			}
		System.out.println();
		}
	}
	
	public static void buscarSitioLibre(String[][]texto,int[][]mesas, int comensales) {
		boolean availableCero = false;
		boolean availableResto = false;
		int nMesa = 0;
		
		//Buscar sitio libre de 0
		for(int j=0;j<mesas[0].length;j++) {
			if(mesas[1][j]==0 && availableCero==false) {
				mesas[1][j] = comensales;
				nMesa = mesas[0][j];
				availableCero = true;
			}
		}
		
		//Buscar en el resto de mesas
		if(!availableCero) {
			for(var i=0;i<mesas[0].length;i++) {
				if((mesas[1][i] + comensales)<=4 && availableResto==false) { //booleano en lugar de break
					mesas[1][i] += comensales;
					nMesa = mesas[0][i];
					availableResto = true;
				}
			}
		}
		
		if(availableCero) {
			System.out.println("Por favor, siéntese en la mesa nº " + nMesa);
		}
		else if(availableResto) {
			System.out.println("Tendrán que compartir mesa. Siéntese en la mesa nº " + nMesa);
		}
		else {
			System.out.println("¡Lo sentimos! En este momento no queda sitio libre.");
		}
	}
}
