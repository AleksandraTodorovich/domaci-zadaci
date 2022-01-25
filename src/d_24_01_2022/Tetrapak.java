package d_24_01_2022;

public class Tetrapak extends Ambalaza{
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
	private boolean daLiSeMozeReciklirati;
	private double osnovnaCena;

	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tetrapak(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza,
			double cena) {
		super(barKod, nazivArtikla, netoTezina, brutoTezina);
		// TODO Auto-generated constructor stub
		this.daLiSeMozeReciklirati = reciklaza;
		this.osnovnaCena = cena;
	}

	public boolean isDaLiSeMozeReciklirati() {
		return daLiSeMozeReciklirati;
	}

	public void setDaLiSeMozeReciklirati(boolean daLiSeMozeReciklirati) {
		this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.daLiSeMozeReciklirati == true) {
			return (this.tezinaPakovanja() * 1.5) + this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}
	}

	@Override
	public void stampaj() {
		System.out.println("Bar kod: " + this.barKod);
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Neto tezina: " + this.netoTezina);
		System.out.println("Bruto tezine: " + this.brutoTezina);
		if (this.daLiSeMozeReciklirati == true) {
			System.out.println("Ambalaza se moze reciklirati.");
		} else {
			System.out.println("Ambalaza se ne moze reciklirati.");
		}
		System.out.println("Cena: " + this.cenaArtikla());
	}
}
