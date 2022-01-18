package d_17_01_2022;

public class ZeleniKarton {
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//
//		U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//
//		Vlado iz nekog razloga nece program da radi kada u glavnoj metodi pokusam da ukucam ime i prezime 
//      bilo profesora ili studenta, cak i kad stavim s.nextLine(); tako da sam ostavila samo ime kao podatak
	
	private String imePrezimeStudenta;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imePrezimeProfesora;
	private int ocena;

	public ZeleniKarton() {

	}

	public ZeleniKarton(String imePrezimeStudenta, String brojIndeksa, String nazivPredmeta, String imePrezimeProfesora,
			int ocena) {

		this.imePrezimeStudenta = imePrezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imePrezimeProfesora = imePrezimeProfesora;
		this.ocena = ocena;
	}

	public String getImePrezimeStudenta() {
		return imePrezimeStudenta;
	}

	public void setImePrezimeStudenta(String imePrezimeStudenta) {
		this.imePrezimeStudenta = imePrezimeStudenta;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImePrezimeProfesora() {
		return imePrezimeProfesora;
	}

	public void setImePrezimeProfesora(String imePrezimeProfesora) {
		this.imePrezimeProfesora = imePrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean daLiJeStudentPolozioIspit() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imePrezimeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imePrezimeProfesora);
	}
}
