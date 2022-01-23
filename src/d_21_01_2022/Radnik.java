package d_21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	protected String imePrezime;
	protected ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();
	
	public Radnik() {
		super();
		
	}
	
	public Radnik(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}
	

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public abstract double plataRadnika ();
	
	public void zaposliUSektor(Sektor sektor) {
		this.nizSektora.add(sektor);
	}
}
