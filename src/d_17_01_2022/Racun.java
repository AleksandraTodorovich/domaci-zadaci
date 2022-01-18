package d_17_01_2022;

public class Racun {
	
//	 2. Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude
//		manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.
			
	public String brojRacuna;
	private String imePrezime;
	private int trenutnoStanjeNaRacunu;

	public Racun() {

	}

	public Racun(String brojRacuna, String imePrezime, int trenutnoStanjeNaRacunu) {
		super();
		this.brojRacuna = brojRacuna;
		this.imePrezime = imePrezime;
		this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getTrenutnoStanjeNaRacunu() {
		return trenutnoStanjeNaRacunu;
	}

	public int novoStanje(int iznos) {
		if (this.trenutnoStanjeNaRacunu > iznos) {
			return trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu - iznos;
		} else {
			return this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
		}

	}

	public void stampaj() {
		System.out.println(this.imePrezime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.trenutnoStanjeNaRacunu + "rsd.");
	}

}
