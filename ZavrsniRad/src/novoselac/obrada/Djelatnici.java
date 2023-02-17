package novoselac.obrada;

import java.util.ArrayList;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
import novoselac.model.Dijete;
import novoselac.model.Djelatnik;
import novoselac.model.Usluga;

public class Djelatnici {
	
	private List<Djelatnik> djelatnici;
	private Start start;

	// geteri i seteri samo za djelatnike
	public List<Djelatnik> getDjelatnici() {
		return djelatnici;
	}

	public void setDjelatnici(List<Djelatnik> djelatnici) {
		this.djelatnici = djelatnici;
	}

	// prazni konstruktor
	public Djelatnici(Start start) {
		super();
		this.start = start;
		djelatnici = new ArrayList<>();
		testPodaci();
	}
	//testni podaci

	private void testPodaci() {
		djelatnici.add(new Djelatnik(1, "Ivana ", "Ivković", "93197060481", "HR7325000098193449454", "animator"));
		djelatnici
				.add(new Djelatnik(2, "Marina ", "Marković", "26403646008", "HR5723400095351463692", "teta čuvalica"));
		djelatnici.add(new Djelatnik(3, "Petar ", "Marinić", "81890337429", "HR3923600008751454128", "animator"));
	
	}
	

	// izbornik djelatnici

	public void izbornik() {
		System.out.println("");
		System.out.println("Izbornik djelatnika");
		System.out.println("1. Pregled svih djelatnika");
		System.out.println("2. Unos novog djelatnika");
		System.out.println("3. Promjena postojećeg djelatnika");
		System.out.println("4. Brisanje djelatnika");
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
			if (djelatnici.size() == 0) {
				System.out.println("Nema djelanika koje bi mijenjali");
				izbornik();
			} else {
				promjena();
			}
			break;
		case 4:
			if (djelatnici.size() == 0) {
				System.out.println("Nema djelatnika koje bi brisali");
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
		int rb = Pomocno.UnosBrojRaspon("Odaberite djelanika kojeg želite obrisati", 1, djelatnici.size());
		djelatnici.remove(rb - 1);
		izbornik();
	}

//case 3 
	private void promjena() {
		pregled(false);
		int rb = Pomocno.UnosBrojRaspon("Odabertie djelatnika kojem želite promijeniti ime ili prezime", 1,
				djelatnici.size());
		Djelatnik m = djelatnici.get(rb - 1);
		m.setSifra(rb);
		m.setIme(Pomocno.unosTeksta("Unesite ime djelatnika"));
		m.setPrezime(Pomocno.unosTeksta("Unesite prezime djelatnika"));
		m.setOib(Pomocno.unosTeksta("Unesite oib djelanika"));
		m.setIban(Pomocno.unosTeksta("Unesite iban djelatnika"));
		m.setRadnoMjesto(Pomocno.unosTeksta("Unesite radno mjesto djelatnika"));

		izbornik();

	}

	// case2
	private void unosNovog() {
		djelatnici.add(unesiNovogDjelatnika());
		izbornik();

	}

	private Djelatnik unesiNovogDjelatnika() {
		Djelatnik m = new Djelatnik();
		m.setSifra(Pomocno.UnosBrojRaspon("Unesi šifru djelanika: ", 1, Integer.MAX_VALUE));
		m.setIme(Pomocno.unosTeksta("Unesi ime djelanika"));
		m.setPrezime(Pomocno.unosTeksta("Unesi prezime djelatnika"));
		m.setOib(Pomocno.unosTeksta("Unesi oib djelanika"));
		m.setIban(Pomocno.unosTeksta("Unesite iban djelanika"));
		m.setRadnoMjesto(Pomocno.unosTeksta("Unesite naziv radnog mjesta djelanika"));
		return m;
	}

	//case 1
	public void pregled(boolean prikaziIzbornik) {
		System.out.println("Djelatnici u aplikaciji");
		int rb = 1;
		for (Djelatnik m : djelatnici) {
			System.out.println(rb++ + "." + m);

		}

		System.out.println("**************************");
		if (prikaziIzbornik) {
			izbornik();
		}

	}

}
