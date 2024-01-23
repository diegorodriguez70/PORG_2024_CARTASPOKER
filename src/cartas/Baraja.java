package cartas;

import java.util.Arrays;

public class Baraja {
	private Cartas baraja[];
	private boolean encontrado=false;

	public Baraja() {
		baraja = new Cartas[52];
		rellenarBaraja();

	}

	private void rellenarBaraja() {
		int j=1;
		char palo='C';
		for (char i = 0; i < baraja.length; i++) {

			if(i==13) {
				palo='P';
				j=1;
			}
			if (i==26) {
				palo='D';
				j=1;
			}
			
			if(i==39) {
				palo='T';
				j=1;
			}
			
			baraja[i] = cartaQueToca(j,palo) ;
			j++;
 
		}
//		return Arrays.toString(baraja);
	}
	 
	
	public Cartas darVuelta(int numero, char palo) {
		int i =0;
		Cartas carta = new Cartas();
		while(i<baraja.length&&!encontrado) {
			if(i==numero) {
				carta=cartaQueToca(numero, palo);
				encontrado=true;
			}
			i++;
		}
		carta.Vueltadada();
		return carta;
		
	}
	
	private Cartas cartaQueToca(int numero, char palo) {
		
		Cartas carta = new Cartas();
		switch (numero) {
		case 1: carta.setNumero('A'); break;
		case 2:carta.setNumero('2');break;
		case 3:carta.setNumero('3');break;
		case 4:carta.setNumero('4');break;
		case 5:carta.setNumero('5');break;
		case 6:carta.setNumero('6');break;
		case 7:carta.setNumero('7');break;
		case 8:carta.setNumero('8');break;
		case 9:carta.setNumero('9');break;
		case 10:carta.setNumero('D');break;
		case 11:carta.setNumero('J');break;
		case 12:carta.setNumero('q');break;
		case 13:carta.setNumero('k');break;
		
		
		}
		carta.setPalo(palo);
		return carta;
	}


	public String toString() {
		return " [baraja=" + Arrays.toString(baraja) + "]";
	}

}
