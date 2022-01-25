package d_24_01_2022;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju
//	treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar
//	prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//	kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza 
//	razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
	private ArrayList<Ambalaza> sveAmbalaze = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.sveAmbalaze.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < sveAmbalaze.size(); i++) {
			if (this.sveAmbalaze.get(i).getBarKod().equals(barkod)) {
				this.sveAmbalaze.remove(i);
			}
		}
	}

	private double cenaSvihAmbalazaSaPopustom(double popust) {
		double suma = 0;
		for (int i = 0; i < sveAmbalaze.size(); i++) {
			suma = suma + this.sveAmbalaze.get(i).cenaArtikla();
		}
		return suma - (suma * popust) / 100;
	}

	public double ukupnaCenaKorpe(SuperKartica kartica) {
		return this.cenaSvihAmbalazaSaPopustom(kartica.getPopust());
	}
}
