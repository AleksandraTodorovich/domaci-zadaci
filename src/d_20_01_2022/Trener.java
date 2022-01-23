package d_20_01_2022;

public class Trener extends Osoba {

	private int godineRadnogIskustva;
	private String tipTrenera;

	public Trener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineRadnogIskustva, String tipTrenera) {
		super(imePrezime, jmbg, godinaRodjenja);
		// TODO Auto-generated constructor stub
		this.godineRadnogIskustva = godineRadnogIskustva;
		this.tipTrenera = tipTrenera;
	}

	public void stampaj() {
		super.stampaj();
		System.out.println("Godine radnog iskustva: " + this.godineRadnogIskustva);
		System.out.println("Tip trenera: " + this.tipTrenera);
	}
}
