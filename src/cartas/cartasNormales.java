package cartas;

public class cartasNormales {
	
	
	
	
	
	public void rellenarNormales(Cartas carta) {
		int j=1;
		char palo = 'C';
		for(int i=0; i<baraja.length;i++) {
			if (i == 13) {
				palo = 'P';
				j = 1;
			}
			if (i == 26) {
				palo = 'D';
				j = 1;
			}

			if (i == 39) {
				palo = 'T';
				j = 1;
			}
			barajaBocaArriba[i]=cartaQueToca(j, palo);
			if (barajaBocaArriba[i].getNumero()!=carta.getNumero() || barajaBocaArriba[i].getPalo()!=carta.getPalo() ) {
				
			}
			else { System.out.println(); barajaBocaArriba[i]=(null);}
			j++;
		}
		}
}
