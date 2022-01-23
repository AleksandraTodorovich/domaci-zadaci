package d_20_01_2022;

public class Igrac extends Osoba {

	private int brojKojiIgracNosi;
	private String pozicijuKojuIgra;
	private boolean kapiten;

	public Igrac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int broj, String pozicijuKojuIgra,
			boolean kapiten) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.brojKojiIgracNosi = broj;
		this.pozicijuKojuIgra = pozicijuKojuIgra;
		this.kapiten = kapiten;
	}

	public int getBrojKojiIgracNosi() {
		return brojKojiIgracNosi;
	}

	public void setBrojKojiIgracNosi(int brojKojiIgracNosi) {
		this.brojKojiIgracNosi = brojKojiIgracNosi;
	}

	public String getPozicijuKojuIgra() {
		return pozicijuKojuIgra;
	}

	public void setPozicijuKojuIgra(String pozicijuKojuIgra) {
		this.pozicijuKojuIgra = pozicijuKojuIgra;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void stampaj() {
		super.stampaj();
		System.out.println("Broj dresa: " + this.brojKojiIgracNosi);
		System.out.println("Pozicija: " + this.pozicijuKojuIgra);
		System.out.println("Da li je igrac kapiten: " + this.kapiten);
	}
}
