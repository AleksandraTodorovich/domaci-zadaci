package d_17_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj zelenih kartona: ");
		int n = s.nextInt();

		ArrayList<ZeleniKarton> spisak = new ArrayList<ZeleniKarton>();
		for (int i = 0; i < n; i++) {
			System.out.println("Unesi ime studenta: ");
			String imeStudenta = s.next(); //ovde sam stavila s.nextLine() i sve jedno nece lepo da prikazuje podatke
			System.out.println("Unesi broj indeksa: ");
			String index = s.next();
			System.out.println("Naziv predmeta: ");
			String predmet = s.next();
			System.out.println("Profesor: ");
			String imeProfesora = s.next(); // isti problem 
			System.out.println("Unesite ocenu: ");
			int ocena = s.nextInt();

			ZeleniKarton podaci = new ZeleniKarton(imeStudenta, index, predmet, imeProfesora, ocena);
			spisak.add(podaci);
		}
		for (int i = 0; i < spisak.size(); i++) {
			System.out.println("Ime i prezime studenta: " + spisak.get(i).getImePrezimeStudenta() + "; ");
			System.out.println("Broj indeksa: " + spisak.get(i).getBrojIndeksa() + "; ");
			System.out.println("Predmet: " + spisak.get(i).getNazivPredmeta() + "; ");
			System.out.println("Profesor: " + spisak.get(i).getImePrezimeProfesora() + "; ");
			System.out.println("Ocena: " + spisak.get(i).getOcena() + "; ");
			System.out.println();
		}

	}

}
