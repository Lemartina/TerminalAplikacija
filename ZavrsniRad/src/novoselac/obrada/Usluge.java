package novoselac.obrada;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
import novoselac.model.Usluga;

public class Usluge {
	private List<Usluga> usluge;
	private Start start; // kreiranje veze između usluge i starta

	// prazni kornstruktor
	public Usluge(Start start) {
		super();
		this.start = start;
		usluge = new ArrayList<>();
		testPodaci();
	}

	// puni konstruktor
	public Usluge(Start start, List<Usluga> usluge) {
		super();

		this.start = start;
		this.usluge = usluge;
		testPodaci();
	}

	// testni podaci
	private void testPodaci() {
		if (Pomocno.DEV) {
			usluge.add(new Usluga(1, "Rođendan", new BigDecimal(20.00), "sat", new BigDecimal(5.00)));
			usluge.add(new Usluga(1, "Dnevno čuvanje", new BigDecimal(10.00), "sat", new BigDecimal(1.00)));
			usluge.add(new Usluga(1, "Tiskanje pozivnica", new BigDecimal(1.00), "kom", new BigDecimal(20.00)));
		}

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
		case 1:
			pregled(true);
			break;
		case 2:
			unosNovog();
			break;
		case 3:
			if (usluge.size() == 0) {
				System.out.println("Nema smjerova koje" + " bi mijenjali");
				izbornik();
			} else {
				promjena();
			}
			break;
		case 4:
			if (usluge.size() == 0) {
				System.out.println("Nema smjerova koje" + " bi brisali");
				izbornik();
			} else {
				brisanje();
			}
			break;
		case 5:
			start.glavniIzbornik();

		}

	}

	// case 4
	private void brisanje() {
		pregled(false);
		int rb = Pomocno.UnosBrojRaspon("Odaberite uslugu koju želite obrisati: ", 1, usluge.size());
		usluge.remove(rb - 1);
		izbornik();
	}

// case 3
	private void promjena() {
		pregled(false);
		int rb = Pomocno.UnosBrojRaspon("Odaberite uslugu koju želite promjeniti: ", 1, usluge.size());
		Usluga u = usluge.get(rb - 1);
		u.setNaziv(Pomocno.unosTeksta("Unesite naziv smjera: "));
		izbornik();
	}
	
	//case 2
		private void unosNovog() {
			usluge.add(unesiNovuUslugu());
			izbornik();
		}

		private Usluga unesiNovuUslugu() {
			Usluga u = new Usluga();
			u.setSifra(Pomocno.UnosBrojRaspon("Unesi šifru usluge: ", 1, Integer.MAX_VALUE));
			u.setNaziv(Pomocno.unosTeksta("Unesi naziv usluge"));
			return u;
		}


//case 1
	private void pregled(boolean prikaziIzbornik) {
		System.out.println("Usluge u aplikaciji");
		int rb = 1;
		for (Usluga u : usluge) {
			System.out.println(rb++ + "." + u);

		}

		System.out.println("**************************");
		if (prikaziIzbornik) {
			izbornik();
		}

	}


	// geteri i seteri
	public List<Usluga> getUsluge() {
		return usluge;
	}

	public void setUsluge(List<Usluga> usluge) {
		this.usluge = usluge;
	}

}
