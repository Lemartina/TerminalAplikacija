package novoselac.obrada;

import java.util.ArrayList;
import java.util.List;

import novoselac.Pomocno;
import novoselac.Start;
import novoselac.model.Dijete;

public class Djeca {

	private List<Dijete> djeca;
	private Start start;

	// prazni konstruktor
	public Djeca(Start start) {
		super();
		this.start = start;
		djeca = new ArrayList<>();

	}

//puni konstruktor
	public Djeca(Start start, List<Dijete> djeca) {
		super();
		this.djeca = djeca;
		this.start = start;
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
//			pregled();
			break;
			case 2:
//			unosNovog();
				break;
		case 5:
			start.glavniIzbornik();
		
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
