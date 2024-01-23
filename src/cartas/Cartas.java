package cartas;

public class Cartas {
	private char palo;
	private char numero;
	private boolean vuelta=false;



	public char getPalo() {
		return palo;
	}

	public void setPalo(char palo) {
		this.palo = palo;
	}

	public char getNumero() {
		return numero;
	}

	public void setNumero(char numero) {
		this.numero = numero;
	}

//	public int avanzar() {
//		 numero++;
//		return (int) numero;
//		
//	}
	
	public void Vueltadada() {
		vuelta=true;

	}
	
	public String toString() {
		if (vuelta) {
			return "\n(palo=" + palo + ", numero=" + numero + ")";
		}
		else {
			return "\n(numero=" + numero + ", palo=" + palo + ")";
		}
		
	}
	
	
}
