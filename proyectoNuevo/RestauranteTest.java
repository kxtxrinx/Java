package proyectoNuevo;
import java.util.Scanner;

public class RestauranteTest {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int comensales;
		
		int[][]mesas = new int[2][9];
		
		
		String[][]texto = new String[2][1];
		texto[0][0] = "Mesa nº:   ";
		texto[1][0] = "Ocupación: ";
		
		//Mesas del 1 al 9
		for(int j=1, i=0;i<mesas[0].length;j++,i++) {
				mesas[0][i] = j;
		}
		
		//Sitios ocupados
		for(int i=0;i<mesas[0].length;i++) {
			mesas[1][i] = (int)(Math.random()*(5-0)) ; //con (4-0)+1 iba del 1 al 4
		}
		
		//Esquema de mesas
		Mesa.mostrarMesas(texto,mesas);
		
		//Menú
		System.out.println("¡Hola!");
		do {
		System.out.print("¿Cuántos comensales van a ser? (Introduzca -1 para salir).");
		comensales = s.nextInt();
		
		if(comensales>4 || (comensales<0 && comensales!=-1)) {
			System.out.println("Lo sentimos, no admitimos grupos de " + comensales + ", haga grupos de 4 personas como máximo e inténtelo de nuevo. ¡Gracias!");
		}else if (comensales!=-1){
			Mesa.buscarSitioLibre(texto,mesas,comensales);
			Mesa.mostrarMesas(texto,mesas);
		}
		}while(comensales>4 || (comensales>0 && comensales!=-1));
		
		if(comensales==-1) {
			System.out.println("Gracias, ¡hasta pronto!");
		}else {
			Mesa.buscarSitioLibre(texto,mesas,comensales);
			
			Mesa.mostrarMesas(texto,mesas);
			
			System.out.println();
		}
		
	}

}
