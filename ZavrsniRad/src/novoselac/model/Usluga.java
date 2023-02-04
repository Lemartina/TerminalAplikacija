package novoselac.model;

import java.math.BigDecimal;

public class Usluga extends Entitet {

	private String naziv;
	private BigDecimal cijena;
	private String program;

	// prazni konstruktor
	public Usluga() {
		super();
	}

	// puni konstruktor
	public Usluga(int sifra, String naziv, BigDecimal cijena, String program) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
		this.program = program;
	}

	// geteri i seteri
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public BigDecimal getCijena() {
		return cijena;
	}

	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	@Override
	public String toString() {
		return naziv;
	}

}
