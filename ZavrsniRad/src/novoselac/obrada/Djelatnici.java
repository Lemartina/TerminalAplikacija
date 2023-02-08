package novoselac.obrada;

import java.util.ArrayList;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
import novoselac.model.Djelatnik;
import novoselac.model.Usluga;

public class Djelatnici {
	private List<Djelatnik>djelatnici;
	private Start start;
	
	
	
	
	// geteri i seteri samo za djelatnike
	public List<Djelatnik> getDjelatnici() {
		return djelatnici;
	}

	public void setDjelatnici(List<Djelatnik> djelatnici) {
		this.djelatnici = djelatnici;
	}

	//prazni konstruktor
	public Djelatnici(Start start) {
		super();
		this.start = start;
		djelatnici = new ArrayList<>();
		testPodaci();
	}

	private void testPodaci() {
		djelatnici.add(new Djelatnik(1, "Ivana ", "Ivković", "93197060481", "HR7325000098193449454", "animator"));
		djelatnici.add(new Djelatnik(2, "Marina ", "Marković", "26403646008", "HR5723400095351463692", "teta čuvalica"));
		djelatnici.add(new Djelatnik(3, "Petar ", "Marinić", "81890337429", "HR3923600008751454128", "animator"));
	}
	
	//izbornik djelatnici

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
//				unosNovog();
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
//				break;
			case 5:
				start.glavniIzbornik();

			}

		}
		
		public void pregled(boolean prikaziIzbornik) {
			System.out.println("Djelatnici u aplikaciji");
			int rb = 1;
			for (Djelatnik d : djelatnici) {
				System.out.println(rb++ + "." + d);

			}

			System.out.println("**************************");
			if (prikaziIzbornik) {
				izbornik();
			}

		}
		
	
		public void izbornik() {
			System.out.println("");
			System.out.println("Djelatnici izbornik");			
		}
}
