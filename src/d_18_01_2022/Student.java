package d_18_01_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private String brojIndeksa;
	private String imePrezime;
	private String tipStudija; 
	private ArrayList<Ispit> predmeti = new ArrayList<Ispit>();

	public Student() {

	}

	public Student(String brojIndeksa, String imePrezime, String tipStudija, ArrayList<Ispit> predmeti) {
		super();
		this.brojIndeksa = brojIndeksa;
		this.imePrezime = imePrezime;
		this.tipStudija = tipStudija;
		this.predmeti = predmeti;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getSviIspiti() {
		return predmeti;
	}

	public void dodajIspitUNiz(Ispit ispit) {
		this.predmeti.add(ispit);
	}

	public double izracunajProsek() {
		int suma = 0;
		int brojac = 0;
		for (int i = 0; i < predmeti.size(); i++) {
			if (this.predmeti.get(i).daLiJeStudentPolozioIspit()) {
				suma = suma + this.predmeti.get(i).getOcena();
				brojac = brojac + 1;
			}
		}
		return suma * 1.0 / brojac;
	}

	public void stampaj() {
		System.out.println(this.brojIndeksa + " - " + this.imePrezime + " - " + this.tipStudija);
		for (int i = 0; i < predmeti.size(); i++) {
			this.predmeti.get(i).stampaj();
		}
		System.out.println("Prosecna ocena: " + this.izracunajProsek());

	}
}
