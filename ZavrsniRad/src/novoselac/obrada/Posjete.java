package novoselac.obrada;

import java.util.ArrayList;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
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
		if (Pomocno.DEV) {
//			posjete.add(new Posjeta(1, "2022-05-01 13:00:00", "2022-05-01 14:00:00", 2));
//			posjete.add(new Posjeta(1, "2022-06-01 14:00:00", "2022-05-01 19:00:00", 1));
//			posjete.add(new Posjeta(1, "2022-07-01 09:00:00", "2022-05-01 11:00:00", 3));

		}

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
//				if (usluge.size() == 0) {
//					System.out.println("Nema smjerova koje" + " bi mijenjali");
//					izbornik();
//				} else {
//					promjena();
//				}
			break;
		case 4:
//				if (usluge.size() == 0) {
//					System.out.println("Nema smjerova koje" + " bi brisali");
//					izbornik();
//				} else {
//					brisanje();
//				 }
			break;
		case 5:
			start.glavniIzbornik();

		}

	}
//ovo nije dobro treba unijeti datum posjete i odabrati djelantika, djelatnike ne ispisuje dobro
	private void unosNovog() {
		Posjeta p = new Posjeta();
		p.setSifra(Pomocno.UnosBrojRaspon("Unesi datum i vrijeme posjete: ", 1, Integer.MAX_VALUE));
		start.getDjelatnici().pregled(false);
		int rb = Pomocno.UnosBrojRaspon("Odaberite djelatnika za posjetu", 1,
				start.getDjelatnici().getDjelatnici().size());
		p.setDjelatnik(start.getDjelatnici().getDjelatnici().get(rb - 1));
		posjete.add(p);
		izbornik();

	}

	// pregled izbornika
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
