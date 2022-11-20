package zad02;

public class MainClass {
	
	public static void main(String[] args) {
		Restoran rest = new Restoran();
		rest.setIme("Oskar");
		rest.setLokacija("Bitola");
		rest.setTelefon("047/612-500");
		rest.setBrSedishta(100);
		
		System.out.println("Kontakt telefonot na restoranot " + rest.getIme() + " koj se naogja vo " + rest.getLokacija() + " e: " + rest.getTelefon());
		System.out.println("Restoranot ima kapacitet od: " + rest.getBrSedishta() + " sedishta.");
	}

}
