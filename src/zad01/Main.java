package zad01;

public class Main {
	
	public static void main(String[] args) {
		Covek c = new Covek ();
		c.setIme("Ivana");
		c.setPrezime("Ivanovska");
		c.setEmbg("25069518610123");
		
		System.out.println("Ime: " + c.getIme());
		System.out.println("Prezime: " + c.getPrezime());
		System.out.println("EMBG: " + c.getEmbg());
	}

}
