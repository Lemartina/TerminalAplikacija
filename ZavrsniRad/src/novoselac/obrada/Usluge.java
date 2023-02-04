package novoselac.obrada;

import java.util.ArrayList;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
import novoselac.model.Usluga;

public class Usluge {
	private List<Usluga> usluge;
	private Start start; //kreiranje veze između usluge i starta
	
	//prazni kornstruktor
	public Usluge(Start start) {
		super();
		this.start=start;
		usluge= new ArrayList<>();
	}

	//puni konstruktor	
	public Usluge(Start start, List<Usluga> usluge) {
		super();
		this.start=start;
		this.usluge = usluge;
	}
//izbornik usluge
	
	public void izbornik() {
		System.out.println("");
		System.out.println("Izbornik usluga");
		System.out.println("1. Pregled svih usluga");
		System.out.println("2. Unos nove usluge");
		System.out.println("3. Promjena postojeće usluge");
		System.out.println("4. Brisanje usluge");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
		
	}
	
	
	
	private void odabirIzbornika() {
	switch (Pomocno.UnosBrojRaspon("Odaberi opciju", 1, 5)) {
	
	case 5:
		start.glavniIzbornik();
		break;
	}
	
}

	//geteri i seteri
	public List<Usluga> getUsluge() {
		return usluge;
	}

	public void setUsluge(List<Usluga> usluge) {
		this.usluge = usluge;
	}
	
	




	
	

}
