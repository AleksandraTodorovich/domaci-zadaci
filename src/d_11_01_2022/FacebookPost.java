package d_11_01_2022;

public class FacebookPost {
//	3..Kreirati klasu FacebookPost koja ima:
//	Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da 
//	postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//	Primer stampanja:
//	Milan Jovanovic >>> Pera Peric
//	Ovo je tekst objave
//	Likes 3 | Shares 1
//
	String imeIPrezimeKorisnik1;
	String imeIPrezimeKorisnik2;
	String txt;
	int brojLike;
	int brojShare;

	public void stampaj() {

		System.out.println(this.imeIPrezimeKorisnik1 + " >>> " + this.imeIPrezimeKorisnik2);
		System.out.println(this.txt);
		System.out.println("Likes " + this.brojLike + " | " + "Shares " + this.brojShare);
		System.out.println();
	}

	public void like() {
		this.brojLike = this.brojLike + 1;
	}

	public void dislike() {
		if (this.brojLike > 0) {
			this.brojLike = this.brojLike - 1;
		}
	}

	public void share() {
		this.brojShare = this.brojShare + 1;
	}
}
