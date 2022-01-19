package d_18_01_2022;

import java.util.ArrayList;

public class Kombinacija {
	
//	2. Zadatak (Za vezbanje)
//	
//	Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. 
//	Znaci nije vam potrebna provera za opseg brojeva.
//	Za potrebe Lotto igre na srecu potrebno je 
//	Kreirati klasu Kombinacija koja ima:
//	id kombinacije (String)
//	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//	Zaglavlje metode je:
//	public boolean daLiJeIstaKombinacija( Kombinacija k)
//	metoda vraca true ako su svi elementi na istim pozicija isti
//	npr: this [0] == k [0], this [1] == k [1] …. 
//	metodu za stampu koja stampa podatke u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23

	private String idKombinacije;
	private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

	public Kombinacija(String idKombinacije, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
		this.idKombinacije = idKombinacije;
		// this.nizBrojeva = nizBrojeva;
		this.nizBrojeva.add(jedan);
		this.nizBrojeva.add(dva);
		this.nizBrojeva.add(tri);
		this.nizBrojeva.add(cetiri);
		this.nizBrojeva.add(pet);
		this.nizBrojeva.add(sest);
		this.nizBrojeva.add(sedam);
	}

	public String getIdKombinacije() {
		return idKombinacije;
	}

	public ArrayList<Integer> getNizBrojeva() {
		return nizBrojeva;
	}

	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		for (int i = 0; i < nizBrojeva.size(); i++) {
			if (this.nizBrojeva.get(i) != k.nizBrojeva.get(i)) {
				return false;
			}
		}
		return true;
	}

	public void stampaj() {
		System.out.println("ID: " + this.idKombinacije);
		for (int i = 0; i < nizBrojeva.size(); i++) {
			System.out.print(this.nizBrojeva.get(i) + ", ");

		}
		System.out.println();
	}

}
