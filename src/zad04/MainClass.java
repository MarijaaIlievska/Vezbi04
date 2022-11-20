package zad04;

public class MainClass {
	
	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil("Toyota", "Corolla", 15400, "Bela");

		System.out.println("Marka: " + avtomobil.getMarka());
		System.out.println("Model: " + avtomobil.getModel());
		System.out.println("Kilometri pred mnozhenje: " + avtomobil.getPominatiKm());
		System.out.println("Kilometri posle mnozhenje: " + avtomobil.mnozenjeKm(5));
		System.out.println("Boja: " + avtomobil.getBoja());
	}

}
