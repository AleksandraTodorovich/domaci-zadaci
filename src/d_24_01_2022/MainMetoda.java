package d_24_01_2022;

public class MainMetoda {

	public static void main(String[] args) {
		//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih 
		//tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

		SuperKartica kartica = new SuperKartica("32/2", "Ana T", 15);
		Korpa korpa = new Korpa();
		Ambalaza tetrapak1 = new Tetrapak("234-44", "Jogurt", 120, 220, true, 120);
		Ambalaza staklena1 = new StaklenaAmbalaza("22-345", "pivo", 320, 540, 25, true, 75);
		Ambalaza tetrapak2 = new Tetrapak("111-21", "Nektar sok", 200, 320, true, 210);
		Ambalaza staklena2 = new StaklenaAmbalaza("23-123", "Vino", 320, 721, 25, false, 350);
		korpa.dodajAmbalazu(staklena1);
		korpa.dodajAmbalazu(tetrapak1);
		korpa.dodajAmbalazu(tetrapak2);
		korpa.dodajAmbalazu(staklena2);
		kartica.stampaj();
		double iznos = korpa.ukupnaCenaKorpe(kartica);
		System.out.println("Iznos sa popustom je: " + iznos);
		tetrapak1.stampaj();
		staklena1.stampaj();
		tetrapak2.stampaj();
		staklena2.stampaj();

	}

}
