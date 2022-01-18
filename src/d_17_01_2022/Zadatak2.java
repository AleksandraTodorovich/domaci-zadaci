package d_17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Racun posaljilac = new Racun("880-324545-12", "Marta Terzic", 120000);
		Racun primalac = new Racun("875-293847-23", "Petar Mikic", 25000);
		Transakcija prenos1 = new Transakcija("12/2", posaljilac, primalac);

		prenos1.izvrsiTransakciju(25000);
		posaljilac.stampaj();
		primalac.stampaj();
		prenos1.stampaj();

	}

}
