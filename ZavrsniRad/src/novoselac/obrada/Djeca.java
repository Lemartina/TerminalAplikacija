package novoselac.obrada;

import java.util.ArrayList;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
import novoselac.model.Dijete;
import novoselac.model.Usluga;

public class Djeca {

	private List<Dijete> djeca;
	private Start start;

	// prazni konstruktor
	public Djeca(Start start) {
		super();
		this.start = start;
		djeca = new ArrayList<>();
		testPodaci();

	}

//puni konstruktor
	public Djeca(Start start, List<Dijete> djeca) {
		super();
		this.djeca = djeca;
		this.start = start;
		testPodaci();
	}

private void testPodaci() {
	if(Pomocno.DEV) {
		djeca.add(new Dijete(1, "Marko", "Marković", "Ivana", "091/236-5236"));
		djeca.add(new Dijete(2, "Luka", "Ivanković", "Marija", "097/125-5246"));
		djeca.add(new Dijete(3, "Josipa", "Josipović", "Gabrijel", "098/259-3265"));
	
	}
	
}

//izbornik djeca

	public void izbornik() {
		System.out.println("");
		System.out.println("Izbornik usluga");
		System.out.println("1. Pregled sve djece");
		System.out.println("2. Unos novog djeteta");
		System.out.println("3. Promjena postojeće djeteta");
		System.out.println("4. Brisanje djeteta");
		System.out.println("5. Povratak na glavni izbornik");
//		odabirIzbornika();

	}

	private void odabirIzbornika() {
		switch (Pomocno.UnosBrojRaspon("Odaberi opciju", 1, 5)) {
		case 1:
			pregled(true);
			break;
			case 2:
//			unosNovog();
				break;
		case 5:
			start.glavniIzbornik();
		
		}
		
	}
	
	
	public void pregled(boolean prikaziIzbornik) {
		System.out.println("Djeca u aplikaciji");
		int rb = 1;
		for (Dijete d : djeca) {
			System.out.println(rb++ + "." + d);

		}

		System.out.println("**************************");
		if (prikaziIzbornik) {
			izbornik();
		}

	}
//geteri i seteri
	public List<Dijete> getDjeca() {
		return djeca;
	}

	public void setDjeca(List<Dijete> djeca) {
		this.djeca = djeca;
	}

}
