package novoselac.model;

import java.math.BigDecimal;

public class Usluga extends Entitet {

	private String naziv;
	private BigDecimal cijena;
	private String jedinicaMjere;
	private BigDecimal kolicina;
	// prazni konstruktor
	public Usluga() {
		super();
	}

	// puni konstruktor

	public Usluga(int sifra, String naziv, BigDecimal cijena, String jedinicaMjere, BigDecimal kolicina) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
		this.jedinicaMjere = jedinicaMjere;
		this.kolicina = kolicina;
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

	public String getJedinicaMjere() {
		return jedinicaMjere;
	}

	public void setJedinicaMjere(String jedinicaMjere) {
		this.jedinicaMjere = jedinicaMjere;
	}

	public BigDecimal getKolicina() {
		return kolicina;
	}

	public void setKolicina(BigDecimal kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return naziv;
	}

}
