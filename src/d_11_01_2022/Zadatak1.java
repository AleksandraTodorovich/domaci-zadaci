package d_11_01_2022;


public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod voce = new Proizvod();

		voce.naziv = "Jabuke";
		voce.cena = 67.5;
		voce.tezina = 2300;
		voce.povecajCenu(30);
		voce.stampaj();
		
		double cenaSaPopustom = voce.vratiCenuSaPopustom(10);
		System.out.println("Cena sa popustom je: " + cenaSaPopustom + "din.");
		
		int postarina = voce.racunajPostarinu();
		System.out.println("Postarina je: " + postarina + "din.");
		System.out.println();
		
		Proizvod povrce = new Proizvod();

		povrce.naziv = "Spanac";
		povrce.cena = 250.30;
		povrce.tezina = 2500;
		povrce.povecajCenu(20);
		povrce.stampaj();
		
		cenaSaPopustom = povrce.vratiCenuSaPopustom(10);
		System.out.println("Cena sa popustom je: " + cenaSaPopustom + "din.");
		
		 postarina = povrce.racunajPostarinu();
		 System.out.println("Postarina je: " + postarina + "din.");
	}

}


