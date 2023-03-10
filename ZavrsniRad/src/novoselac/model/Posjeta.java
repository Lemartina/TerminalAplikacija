package novoselac.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posjeta extends Entitet {

	//svojstva
	private Date datumVrijemeDolaska;
	private Date datumVrijemeOdlaska;
	private String napomena;
	private Djelatnik djelatnik;
	private List<Dijete> djeca;
	private List<Usluga>usluge;
	
	
		//prazni konstruktor
	public Posjeta() {
		super();
		djeca= new ArrayList<>();
		usluge= new ArrayList<>();
		
	}
	// puni konstruktor
	public Posjeta(int sifra, Date datumVrijemeDolaska, Date datumVrijemeOdlaska, String napomena, Djelatnik djelatnik,
			List<Dijete> djeca, List<Usluga> usluge) {
		super(sifra);
		this.datumVrijemeDolaska = datumVrijemeDolaska;
		this.datumVrijemeOdlaska = datumVrijemeOdlaska;
		this.napomena = napomena;
		this.djelatnik = djelatnik;
		this.djeca = djeca;
		this.usluge = usluge;
	}



	
	//geteri i seteri
	
	public Date getDatumVrijemeDolaska() {
		return datumVrijemeDolaska;
	}
	public void setDatumVrijemeDolaska(Date datumVrijemeDolaska) {
		this.datumVrijemeDolaska = datumVrijemeDolaska;
	}
	public Date getDatumVrijemeOdlaska() {
		return datumVrijemeOdlaska;
	}
	public void setDatumVrijemeOdlaska(Date datumVrijemeOdlaska) {
		this.datumVrijemeOdlaska = datumVrijemeOdlaska;
	}
	public String getNapomena() {
		return napomena;
	}
	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
	public Djelatnik getDjelatnik() {
		return djelatnik;
	}
	public void setDjelatnik(Djelatnik djelatnik) {
		this.djelatnik = djelatnik;
	}
	public List<Dijete> getDjeca() {
		return djeca;
	}
	public void setDjeca(List<Dijete> djeca) {
		this.djeca = djeca;
	}
	public List<Usluga> getUsluge() {
		return usluge;
	}
	public void setUsluge(List<Usluga> usluge) {
		this.usluge = usluge;
	}
	
	@Override
	public String toString() {
		return datumVrijemeDolaska  +  "(" + djelatnik.getIme()  + djelatnik.getPrezime()+ ")";
	}
}
