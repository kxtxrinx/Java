package ejercicio5;

import java.util.*;

public class Moneda {
	static String aParteMoneda[] = {"Cara", "Cruz"};
	static String aDinero[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
	private String dinero, parteMoneda;
	static int contMonedasCreadas;
	
	public Moneda() {
		Moneda comparativo = Ej7.listaMonedas.get(contMonedasCreadas);
		contMonedasCreadas++;
		int dineroR;
		int parteMonedaR;
		String dineroRandom;
		String parteMonedaRandom;
		do {
			dineroR = (int)(Math.random()*aDinero.length);
			parteMonedaR = (int)(Math.random()*aParteMoneda.length);
			
			dineroRandom = aDinero[dineroR];
			// PENDIENTE
			
			parteMonedaRandom = aParteMoneda[parteMonedaR];
			/*this.dinero = aDinero[dineroR];
			this.parteMoneda = aParteMoneda[parteMonedaR]*/
		}while(dineroRandom!=comparativo.dinero);
	}
	
	@Override
	public String toString() {
		return dinero + " - " + parteMoneda;
	}
}
