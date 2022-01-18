package d_17_01_2022;

public class Transakcija {
//		Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima 
//		parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu 
//		proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. 
//		Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), 
//		a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna
//		Naravno u glavnom kreirati objekte i testirati funkcionalnosti 
	
	private String idTransakcije;
	private Racun saKogSePrenoseSredstva;
	private Racun naKojiSePrenoseSredstva;

	public Transakcija() {

	}

	public Transakcija(String idTransakcije, Racun saKogSePrenoseSredstva, Racun naKojiSePrenoseSredstva) {
		this.idTransakcije = idTransakcije;
		this.saKogSePrenoseSredstva = saKogSePrenoseSredstva;
		this.naKojiSePrenoseSredstva = naKojiSePrenoseSredstva;
	}

	public String getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(String idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public Racun getSaKogSePrenoseSredstva() {
		return saKogSePrenoseSredstva;
	}

	public void setSaKogSePrenoseSredstva(Racun saKogSePrenoseSredstva) {
		this.saKogSePrenoseSredstva = saKogSePrenoseSredstva;
	}

	public Racun getNaKojiSePrenoseSredstva() {
		return naKojiSePrenoseSredstva;
	}

	public void setNaKojiSePrenoseSredstva(Racun naKojiSePrenoseSredstva) {
		this.naKojiSePrenoseSredstva = naKojiSePrenoseSredstva;
	}

	private int provizijaTransakcije(int visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		} else {
			return visinaTransakcije / 100;
		}

	}

	public void izvrsiTransakciju(int visinaTransakcije) {
		if (this.saKogSePrenoseSredstva.getTrenutnoStanjeNaRacunu() >= visinaTransakcije
				+ this.provizijaTransakcije(visinaTransakcije)) {
			this.saKogSePrenoseSredstva.novoStanje(visinaTransakcije + this.provizijaTransakcije(visinaTransakcije));
			this.naKojiSePrenoseSredstva.novoStanje(-visinaTransakcije);
		}
	}

	public void stampaj() {
		System.out.println(this.idTransakcije);
		System.out.println("Racun sa: " + this.getSaKogSePrenoseSredstva().getImePrezime() + " - "
				+ this.saKogSePrenoseSredstva.brojRacuna);
		System.out.println("Racun na: " + this.naKojiSePrenoseSredstva.getImePrezime() + " - "
				+ this.naKojiSePrenoseSredstva.brojRacuna);
	}

}
