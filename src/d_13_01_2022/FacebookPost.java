package d_13_01_2022;

public class FacebookPost {
//		1.Kreirati klasu FacebookPost koja ima:
//		Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da 
//		postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		  Od gettera i settera:
//		korisnik moze da procita bilo koji atribut 
//		ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
//		 Konstruktore:
//			konstruktori koji su potrebni i logicni
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1
	private String imePrezimeAutoraPosta;
	private String imePrezimeVlasnikaProfila;
	private String txtObjave;
	private int brojLajkova;
	private int brojSerova;
	private int brojDislike;

	public FacebookPost() {

	}

	public FacebookPost(String imePrezimeAutora, String imePrezimeVlasnikaFB, String txt, int brLike, int brShare,
			int brDislike) {
		this.imePrezimeAutoraPosta = imePrezimeAutora;
		this.imePrezimeVlasnikaProfila = imePrezimeVlasnikaFB;
		this.txtObjave = txt;
		this.brojLajkova = brLike;
		this.brojSerova = brShare;
		this.brojDislike = brDislike;
	}

	public void setImePrezimeAutora(String imePrezimeAutoraObjave) {
		this.imePrezimeAutoraPosta = imePrezimeAutoraObjave;
	}

	public String getImePrezimeAutora() {
		return this.imePrezimeAutoraPosta;
	}

	public void setImePrezimeVlasnikaFB(String ImePrezimeVlasnikaFB) {
		this.imePrezimeVlasnikaProfila = imePrezimeVlasnikaProfila;
	}

	public String getImePrezimeVlasnikaFB() {
		return this.imePrezimeVlasnikaProfila;
	}

	public void setTxt(String txt) {
		this.txtObjave = txt;
	}

	public String getTxt() {
		return this.txtObjave;
	}

	public int getBrLike() {
		return this.brojLajkova;
	}

	public int getBrShare() {
		return this.brojSerova;
	}

	public void brojLike() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void brojShare() {
		this.brojSerova = this.brojSerova + 1;
	}

	public void disLike() {
		if (this.brojDislike > 0) {
			this.brojDislike = this.brojDislike - 1;
		}
	}

	public void stampaj() {
		System.out.println(this.imePrezimeAutoraPosta + " >>>>>> " + this.imePrezimeVlasnikaProfila);
		System.out.println(this.txtObjave);
		System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojSerova);
	}
}
