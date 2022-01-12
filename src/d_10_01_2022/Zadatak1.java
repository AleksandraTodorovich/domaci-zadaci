package d_10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Proizvod voce = new Proizvod();

		voce.naziv = "Jabuke";
		voce.cena = 67.5;
		voce.tezina = 2300;
		voce.stampaj();
		Proizvod povrce = new Proizvod();

		povrce.naziv = "Spanac";
		povrce.cena = 250.30;
		povrce.tezina = 2537;
		povrce.stampaj();

	}

}
