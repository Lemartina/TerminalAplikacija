package novoselac.model;

public abstract class Entitet {
	
	//svojstva
	private int sifra;

	
	//prazan konstruktor
	public Entitet() {
		super();
	}

	//puni konstrukotr
	public Entitet(int sifra) {
		super();
		this.sifra = sifra;
	}

	//geteri i seteri
	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	

}
