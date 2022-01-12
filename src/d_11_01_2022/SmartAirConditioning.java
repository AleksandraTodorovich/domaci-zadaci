package d_11_01_2022;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;

public class SmartAirConditioning {
//	2. Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//		atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//		atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//		atribut za mod (hladi/greje)
//		metodu za stampu - stampa u formatu 
//		marka - mod - termperatura
//		metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//		30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//		metodu koja racuna koliko klima novca potrosi za mesec dana
//		Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//		Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//		Metoda vraca ukupnu cenu za taj mesec
//
//		U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
	
	String marka;
	int temperatura;
	String mode;
	int potrosnjaDokGreje;
	int potrosnjaDokHladi;

	public void stampaj() {
		System.out.println("Marka: " + this.marka);
		System.out.println("Grejanje/Hladjenje: " + this.mode);
		System.out.println("Trenutna temperatura: " + this.temperatura + "C.");

	}

	public int potrosnjaNaMesecnomNivou() {
		if (mode.equals("Greje")) {
			return (30 * 15 * this.potrosnjaDokGreje);
		} else {
			return (30 * 15 * this.potrosnjaDokHladi);
		}
	}

	public int potrosnjaStrujeNaMesecnomNivou(int kilovatCas) {
		if (kilovatCas <= 350) {
			return kilovatCas * 6;
		} else {
			return 350 * 6 + (kilovatCas - 350) * 9;
		}

	}
	  
}
