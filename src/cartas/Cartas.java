package cartas;

public class Cartas {
	private char palo;
	private char numero;
	



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

	public String toString() {
		return "\n(palo=" + palo + ", numero=" + numero + ")";
	}
	
	
}
