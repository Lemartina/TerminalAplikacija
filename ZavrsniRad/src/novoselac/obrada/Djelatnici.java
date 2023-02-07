package novoselac.obrada;

import java.util.ArrayList;
import java.util.List;

import novoselac.Start;
import novoselac.model.Djelatnik;

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
		djelatnici.add(new Djelatnik(1, "Ivana", "Ivković", "93197060481", "HR7325000098193449454", "animator"));
		djelatnici.add(new Djelatnik(2, "Marina", "Marković", "26403646008", "HR5723400095351463692", "teta čuvalica"));
		djelatnici.add(new Djelatnik(3, "Petar", "Marinić", "81890337429", "HR3923600008751454128", "animator"));
	}
	
}
