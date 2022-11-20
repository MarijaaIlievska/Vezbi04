package zad03;

public class Proizvod {
	private String ime;
	private double cena;
	private String proizvoditel;
	private double tezhina;
	
	public Proizvod () {
		this.ime = "Atlantis";
		this.cena = 40;
		this.proizvoditel = "Vitaminka";
		this.tezhina = 43;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getProizvoditel() {
		return proizvoditel;
	}

	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}

	public double getTezhina() {
		return tezhina;
	}

	public void setTezhina(double tezhina) {
		this.tezhina = tezhina;
	}

}
