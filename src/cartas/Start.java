package cartas;

public class Start {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
//		Cartas carta1 = new Cartas();
//		carta1.setNumero('A');
//		carta1.setPalo('C');

//		baraja.rellenarBaraja();
		System.out.println ("Le has dado la vuelta a la carta "+baraja.darVuelta(2,'D'));
		System.out.println ("Le has dado la vuelta a la carta "+baraja.darVuelta(3,'D'));
		

		System.out.println(baraja);

	}

}
