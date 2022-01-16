package d_14_01_2022;

public class Knjiga {
//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.
	private String isbn;
	private String nazivKnjige;
	private int godinaIzdanja;
	private Autor autor;

	public Knjiga() {

	}

	public Knjiga(String kod, String naslov, int godina, Autor autor) {
		this.isbn = kod;
		this.nazivKnjige = naslov;
		this.godinaIzdanja = godina;
		this.autor = autor;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setNazivKnjige(String naslov) {
		this.nazivKnjige = naslov;
	}

	public String getNaslovKnjige() {
		return this.nazivKnjige;
	}

	public void setGodina(int godina) {
		this.godinaIzdanja = godina;
	}

	public int getGodina() {
		return this.godinaIzdanja;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void stampaj() {
		System.out.println(this.isbn);
		System.out.println(this.nazivKnjige + " - " + this.godinaIzdanja);
		System.out.print("Autor: ");
		autor.stampaj();

	}
}
