package d_14_01_2022;

public class Autor {
//	1. Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)

//	Kreirati klasu Knjiga koji ima:
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 

//	U glavnom programu napraviti vise autora sa vise knjiga.
	
	private String imeAutora;
	private String prezimeAutora;

	public Autor() {

	}

	public Autor(String ime, String prezime) {
		this.imeAutora = ime;
		this.prezimeAutora = prezime;
	}

	public void setIme(String ime) {
		this.imeAutora = ime;
	}

	public String getIme() {
		return this.imeAutora;
	}

	public void setPreizme(String prezime) {
		this.prezimeAutora = prezime;
	}

	public String getPrezime() {
		return this.prezimeAutora;
	}

	public void stampaj() {
		System.out.println(this.imeAutora + " " + this.prezimeAutora);
	}
}
