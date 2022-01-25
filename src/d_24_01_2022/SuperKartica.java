package d_24_01_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	private String BrojKartice;
	private String imePrezimeVlasnika;
	private double popust;

	public SuperKartica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuperKartica(String brojKartice, String imePrezimeVlasnika, double popust) {
		super();
		BrojKartice = brojKartice;
		this.imePrezimeVlasnika = imePrezimeVlasnika;
		this.popust = popust;
	}

	public String getBrojKartice() {
		return BrojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		BrojKartice = brojKartice;
	}

	public String getImePrezimeVlasnika() {
		return imePrezimeVlasnika;
	}

	public void setImePrezimeVlasnika(String imePrezimeVlasnika) {
		this.imePrezimeVlasnika = imePrezimeVlasnika;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public void stampaj() {
		System.out.println(this.BrojKartice + " - " + this.imePrezimeVlasnika);

	}

}
