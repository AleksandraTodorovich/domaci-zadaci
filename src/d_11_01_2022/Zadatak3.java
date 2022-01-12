package d_11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacebookPost nikola = new FacebookPost();

		nikola.imeIPrezimeKorisnik1 = "Nikola Mikic";
		nikola.imeIPrezimeKorisnik2 = "Petar Peric";
		nikola.txt = "Vece u bioskopu";
		nikola.brojLike = 5;
		nikola.brojShare = 1;
		nikola.dislike();
		nikola.share();
		nikola.stampaj();

		FacebookPost milena = new FacebookPost();

		milena.imeIPrezimeKorisnik1 = "Milena Maric";
		milena.imeIPrezimeKorisnik2 = "Ivana Petrovic";
		milena.txt = "Leto 2021 u Grckoj";
		milena.brojLike = 150;
		milena.brojShare = 30;
		milena.like();
		milena.share();
		milena.stampaj();

	}

}
