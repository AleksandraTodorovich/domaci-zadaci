package d_11_01_2022;

public class Proizvod {
	
//	1. Napisati klasu Proizvod koja ima atribute
//	a. naziv proizvoda (String)
//	b. cenu proizvoda (double)
//	c. težinu proizvoda u gramima. (double)
//		i metode:
//	d. stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//	e. povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati
//	cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//	f. vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost
//	je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. 
//	Smatrati da je parametar popust u opsegu od 0 do 100.
//	g. racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko 
//	kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti 
//	od tezine:	
//	za tezinu do 100g, postarina iznosi 200din
//	za tezinu od 101g do 500g, postarina iznosi 400din
//	za tezinu preko 500g, postarina iznosi 1000din
//
//	U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od 
//  definisanih funkcija.
	
	String naziv;
	double cena;
	double tezina;

	public void stampaj() {

		System.out.println("Naziv proizvoda: " + this.naziv);
		System.out.println("Cena je: " + this.cena + "din.");
		System.out.println("Tezina: " + this.tezina + "gr.");

	}
	public void povecajCenu (int povecanje) {
		this.cena = this.cena + povecanje;
		
		
	}
	public double vratiCenuSaPopustom (double popust) {
		 double cenaSaPopustom = this.cena - popust;
		 return cenaSaPopustom;
	}
	public int racunajPostarinu () {
		if (this.tezina <= 100) {
			return 200;
		}else if (this.tezina > 100 && this.tezina <= 500) {
			return 400;
		}else {
			return 1000;
		}
	}
	
	
}
