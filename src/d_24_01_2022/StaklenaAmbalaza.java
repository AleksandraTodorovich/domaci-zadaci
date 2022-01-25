package d_24_01_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.
	private int kaucijaZaFlasu;
	private boolean daLiJeKaucijaNeophodna;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaklenaAmbalaza(String barKod, String nazivArtikla, double netoTezina, double brutoTezina, int kaucija,
			boolean daLiJeKaucijaNeophodna, double osnovnaCena) {
		super(barKod, nazivArtikla, netoTezina, brutoTezina);
		// TODO Auto-generated constructor stub
		this.kaucijaZaFlasu = kaucija;
		this.daLiJeKaucijaNeophodna = daLiJeKaucijaNeophodna;
		this.osnovnaCena = osnovnaCena;
	}

	public int getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(int kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isDaLiJeKaucijaNeophodna() {
		return daLiJeKaucijaNeophodna;
	}

	public void setDaLiJeKaucijaNeophodna(boolean daLiJeKaucijaNeophodna) {
		this.daLiJeKaucijaNeophodna = daLiJeKaucijaNeophodna;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public double cenaArtikla() {
		if (this.daLiJeKaucijaNeophodna == true) {
			return (this.osnovnaCena * 1.2) + this.kaucijaZaFlasu;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}

	@Override
	public void stampaj() {
		System.out.println("Bar kod: " + this.barKod);
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Neto tezina: " + this.netoTezina);
		System.out.println("Bruto tezine: " + this.brutoTezina);
		System.out.println("Iznos kaucije za flasu: " + this.kaucijaZaFlasu);
		if (this.daLiJeKaucijaNeophodna == true) {
			System.out.println("Morate platiti kauciju.");
		} else {
			System.out.println("Kaucija nije neophodna.");
		}
		System.out.println("Osnovna cena ambalaze: " + this.cenaArtikla());

	}

}
