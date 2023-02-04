package novoselac;

import java.util.Scanner;

import novoselac.obrada.Usluge;

public class Start {
	
	private Usluge usluge;
	
	public Start() {
		
		
		Pomocno.ulaz= new Scanner(System.in);
		usluge= new Usluge(this);
		pozdravnaPoruka();
		glavniIzbornik();
		
		
	}


public void glavniIzbornik() {
	System.out.println("");
	System.out.println("Dostupne opcije");
	System.out.println("1. Usluge");
	System.out.println("2. Posjete");
	System.out.println("3. Djeca");
	System.out.println("4. Djelatnici");
	System.out.println("5. Izlaz iz programa");
	odabirGavnogIzbornika();	
}
private void odabirGavnogIzbornika() {
	
	switch(Pomocno.UnosBrojRaspon("Odabrana opcija;",1,5)) {
	case 1:
		usluge.izbornik();
		break;
	case 5:
		System.out.println("Doviđenja!");
	}
	
}
private void pozdravnaPoruka() {
	System.out.println("Dobrodošli u Dječja igraonica terminal aplikaciju");
	
}


public static void main(String[] args) {
	new Start();
}

}
