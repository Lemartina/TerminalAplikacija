package novoselac.obrada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
import novoselac.model.Dijete;
import novoselac.model.Djelatnik;
import novoselac.model.Posjeta;
import novoselac.model.Usluga;

public class Posjete {

	private List<Posjeta> posjete;
	private Start start;

	// prazni konstruktor

	public Posjete(Start start) {
		super();
		this.start = start;
		posjete = new ArrayList<>();
		testPodaci();
	}

	// puni konstruktor
	public Posjete(List<Posjeta> posjete, Start start) {
		super();
		this.posjete = posjete;
		this.start = start;
		testPodaci();
	}

	private void testPodaci() {

//			posjete.add(new Posjeta(1, Pomocno.unosDatuma(), Pomocno.unosDatuma(),"dijete grize",
//					new Djelatnik(1, "Ivana ", "Ivković", "93197060481", "HR7325000098193449454", "animator"), 
//					start.getDjeca().getDjeca().subList(1, 3), 
//					start.getUsluge().getUsluge().subList(1, 3)));
//			
//			posjete.add(new Posjeta(2, Pomocno.unosDatuma(), Pomocno.unosDatuma(),"dijete grize",
//					new Djelatnik(2, "Marina ", "Marković", "26403646008", "HR5723400095351463692", "teta čuvalica"), 
//					start.getDjeca().getDjeca().subList(1, 3), 
//					start.getUsluge().getUsluge().subList(1, 3)));
//			
//			posjete.add(new Posjeta(3, Pomocno.unosDatuma(), Pomocno.unosDatuma(),"dijete grize",
//					new Djelatnik(3, "Petar ", "Marinić", "81890337429", "HR3923600008751454128", "animator"), 
//					start.getDjeca().getDjeca().subList(1, 3), 
//					start.getUsluge().getUsluge().subList(1, 3)));
		

		

	}

	// izbornik usluge

	public void izbornik() {
		System.out.println("");
		System.out.println("Izbornik posjeta");
		System.out.println("1. Pregled svih posjeta");
		System.out.println("2. Unos nove posjete");
		System.out.println("3. Promjena postojeće posjete");
		System.out.println("4. Brisanje posjete");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();

	}

	private void odabirIzbornika() {
		switch (Pomocno.UnosBrojRaspon("Odaberi opciju", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unosNovog();
			break;
		case 3:
				if (posjete.size() == 0) {
					System.out.println("Nema posjete koju bi mijenjali");
					izbornik();
				} else {
					promjena();
				}
			break;
		case 4:
				if (posjete.size() == 0) {
					System.out.println("Nema temina koje bi brisali");
					izbornik();
				} else {
					brisanje();
				 }
			break;
		case 5:
			start.glavniIzbornik();

		}

	}
	
	//case 4
	
	private void brisanje() {
		pregled(false);
		int rb = Pomocno.UnosBrojRaspon("Odaberite termin koji želite obrisati: ", 1, posjete.size());
		posjete.remove(rb - 1);
		izbornik();
	}

	//case3
private void promjena() {
	pregled(false);
	int rb = Pomocno.UnosBrojRaspon("Odaberite posjetu koju želite promjeniti: ", 1, posjete.size());
	Posjeta p = posjete.get(rb - 1);
	p.setDatumVrijemeDolaska(Pomocno.unosDatuma());
	
	izbornik();
		
	}

//case 2 ovo nije dobro treba unijeti datum posjete 
private void unosNovog() {
		Posjeta p = new Posjeta();
		p.setDatumVrijemeDolaska(Pomocno.unosDatuma());
		p.setDatumVrijemeOdlaska(Pomocno.unosDatuma1());
		p.setNapomena(Pomocno.unosTeksta("Unesite napomenu: "));
		start.getDjelatnici().pregled(false);
		int rb = Pomocno.UnosBrojRaspon("Odaberite djelatnika za posjetu", 1,
				start.getDjelatnici().getDjelatnici().size());
		p.setDjelatnik(start.getDjelatnici().getDjelatnici().get(rb - 1));
		
		
		
		start.getUsluge().pregled(false);
		 rb = Pomocno.UnosBrojRaspon("Odaberite uslugu za posjetu", 1,
				start.getUsluge().getUsluge().size());
//		p.setUsluga(start.getUsluge()).getUsluge().get(rb - 1));
		
		while(true) {
			
			
			start.getDjeca().pregled(false);
			rb = Pomocno.UnosBrojRaspon("Odaberite dijete za dodavanje posjete", 
					1, start.getDjeca().getDjeca().size());
			if(Pomocno.UnosBrojRaspon("0 za kraj dodavanje djeteta", 
					0, Integer.MAX_VALUE)==0);{
				break;
			}
					
					

		}
		
		
		
		posjete.add(p);
		izbornik();

	}

	// case 1
	private void pregled(boolean prikaziIzbornik) {
		System.out.println("Posjete u aplikaciji");
		int rb = 1;
		for (Posjeta p : posjete) {
			System.out.println(rb++ + "." + p);

		}

		System.out.println("**************************");
		if (prikaziIzbornik) {
			izbornik();
		}

	}

	// geteri i seteri
	public List<Posjeta> getPosjete() {
		return posjete;
	}

	public void setPosjete(List<Posjeta> posjete) {
		this.posjete = posjete;
	}

}
