package d_20_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Broj unosa: ");
		int n = s.nextInt();

		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();

		for (int i = 0; i < n; i++) {
			System.out.println("Ime: ");
			String imeIgraca = s.next();
			System.out.println("JMBG: ");
			String jmbg = s.next();
			System.out.println("Godina rodjenja: ");
			int godRodjenja = s.nextInt();
			System.out.println("Broj dresa: ");
			int brojDresa = s.nextInt();
			System.out.println("Pozicija: ");
			String pozicija = s.next();
			System.out.println("Da li je igrac kapiten: ");
			boolean kapiten = s.nextBoolean();

			Igrac igrac = new Igrac(imeIgraca, jmbg, godRodjenja, brojDresa, pozicija, kapiten);
			igraci.add(igrac);
		}
		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).stampaj();
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Ime: ");
			String imeTrenera = s.next();
			System.out.println("JMBG: ");
			String jmbg = s.next();
			System.out.println("Godina rodjenja: ");
			int godRodjenja = s.nextInt();
			System.out.println("Godine radnog iskustva: ");
			int iskustvo = s.nextInt();
			System.out.println("Tip trenera: ");
			String tipTrenera = s.next();

			Trener trener = new Trener(imeTrenera, jmbg, godRodjenja, iskustvo, tipTrenera);
			treneri.add(trener);
		}
		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).stampaj();
		}
	}

}
