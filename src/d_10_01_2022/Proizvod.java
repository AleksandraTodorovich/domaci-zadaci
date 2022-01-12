package d_10_01_2022;

public class Proizvod {
//	1. Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double) i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//	U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

	String naziv;
	double cena;
	double tezina;

	public void stampaj() {

		System.out.println("Naziv proizvoda: " + this.naziv);
		System.out.println("Cena proizvoda: " + this.cena + " din.");
		System.out.println("Tezina proizvoda: " + this.tezina + " gr.");
		System.out.println();

	}

}
